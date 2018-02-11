package com.kodilla.good.patterns.challenges.food2door;

public class SupplierProcessor {
    private final OrderService orderService;
    private boolean orderProcessResult;

    public SupplierProcessor(OrderService orderService) {
        this.orderService = orderService;
    }

    public String processOrder(Order order) {
        orderProcessResult = orderService.execute(order);
        return orderProcessResult ? ProcessResult.SUCCESS : ProcessResult.FAILURE;
    }
}