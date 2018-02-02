package com.kodilla.good.patterns.challenges.allegro;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                          final OrderService orderService,
                          final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest){
        boolean isBought = orderService.buyProduct(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrder(), orderRequest.getDelivery());
        if (isBought) {
            informationService.inform(orderRequest.getUser());
            orderRepository.buyProduct(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrder(), orderRequest.getDelivery());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
