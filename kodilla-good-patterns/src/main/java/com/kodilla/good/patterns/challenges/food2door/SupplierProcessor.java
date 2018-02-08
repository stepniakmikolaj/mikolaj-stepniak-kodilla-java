package com.kodilla.good.patterns.challenges.food2door;

public class SupplierProcessor {
    private final OrderService orderService;
    private boolean orderProcessResult;

    public SupplierProcessor(OrderService orderService) {
        this.orderService = orderService;
    }

    public void processResult(Order order) {
        orderProcessResult = orderService.execute(order);
        System.out.println(orderProcessResult ? ProcessResult.SUCCESS : ProcessResult.FAILURE);
    }
}