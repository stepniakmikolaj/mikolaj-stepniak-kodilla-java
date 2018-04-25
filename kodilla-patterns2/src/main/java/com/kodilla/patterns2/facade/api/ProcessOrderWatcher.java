package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Aspect
@Component
public class ProcessOrderWatcher {
    private final Logger LOGGER = LoggerFactory.getLogger(ProcessOrderWatcher.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..)) && target(object) && args(orderDto, userId)")
    public void logEvent(Object object, OrderDto orderDto, Long userId) {
        LOGGER.info("Class: " + object.getClass().getName() +
                " Items: " + orderDto.getItems().stream()
                .map(n -> n.getProductId().toString())
                .collect(Collectors.joining(", ")) +
                " User: " + userId.toString());
    }

}
