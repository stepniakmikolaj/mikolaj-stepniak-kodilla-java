package com.kodilla.good.patterns.challenges.allegro;

public class OrderProcessor {
    private InformationService informationService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                          final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest){
        boolean isBought = orderRepository.saveOrder(orderRequest);
        if (isBought) {
            informationService.inform(orderRequest);
            orderRepository.saveOrder(orderRequest);
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
