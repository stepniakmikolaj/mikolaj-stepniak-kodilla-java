package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class SupplierProcessor {
    private final OrderService orderService;
    private boolean orderProcessResult;

    public SupplierProcessor(OrderService orderService) {
        this.orderService = orderService;
    }

    public void process(List<Order> orders) {
        orderProcessResult = orderService.execute(orders);
    }

    public void orderProcessResult() {
        System.out.println(orderProcessResult ? ProcessResult.SUCCESS : ProcessResult.FAILURE);
    }
}