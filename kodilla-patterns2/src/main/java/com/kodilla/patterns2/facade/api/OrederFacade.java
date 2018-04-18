package com.kodilla.patterns2.facade.api;

import com.kodilla.patterns2.facade.ShopService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class OrederFacade {
    @Autowired
    private ShopService shopService;
    private static final Logger LOGGER = LoggerFactory.getLogger(OrederFacade.class);

    public void proccesOrder(final OrderDto orderDto, final Long userId) throws OrderProcesingExecption {
        boolean wasError = false;
        long orderId = shopService.openOrder(userId);
        if (orderId < 0) {
            LOGGER.error(OrderProcesingExecption.ERR_NOT_AUTHORISED);
            wasError = true;
            throw new OrderProcesingExecption(OrderProcesingExecption.ERR_NOT_AUTHORISED);
        }
        try {
            for (ItemDto orderItem : orderDto.getItems()) {
                LOGGER.info("Adding item " + orderItem.getProductId() + ", " + orderItem.getQuantity() + " pcs");
                shopService.addItem(orderId, orderItem.getProductId(), orderItem.getQuantity());
            }
            BigDecimal value = shopService.calculateValue(orderId);
            LOGGER.info("Order value is: " + value + " USD");
            if (!shopService.doPayment(orderId)) {
                LOGGER.error(OrderProcesingExecption.ERR_PAYMENT_REJECTED);
                wasError = true;
                throw new OrderProcesingExecption(OrderProcesingExecption.ERR_PAYMENT_REJECTED);
            }
            LOGGER.info("Payment for order was done");
            if (!shopService.verifyOrder(orderId)) {
                LOGGER.error(OrderProcesingExecption.ERR_VERIFICATION_ERROR);
                wasError = true;
                throw new OrderProcesingExecption(OrderProcesingExecption.ERR_VERIFICATION_ERROR);
            }
            LOGGER.info("Order is ready to submit");
            if (!shopService.submitOrder(orderId)) {
                LOGGER.error(OrderProcesingExecption.ERR_SUBMITTING_ERROR);
                wasError = true;
                throw new OrderProcesingExecption(OrderProcesingExecption.ERR_SUBMITTING_ERROR);
            }
            LOGGER.info("Order " + orderId + " submitted");
        } finally {
            if (wasError) {
                LOGGER.info("Canceling order " + orderId);
                shopService.cancelOrder(orderId);
            }
        }
    }
}
