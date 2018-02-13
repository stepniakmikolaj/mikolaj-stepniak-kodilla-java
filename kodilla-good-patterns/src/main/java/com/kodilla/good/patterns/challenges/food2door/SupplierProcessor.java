package com.kodilla.good.patterns.challenges.food2door;

public class SupplierProcessor {
    private final OrderService orderService;
    private boolean orderProcessResult;

    public SupplierProcessor(OrderService orderService) {
        this.orderService = orderService;
    }

    public ProcessResult processOrder(Order order) {
        orderProcessResult = orderService.execute(order);
        return orderProcessResult ? ProcessResult.PROCESS_RESULT_SUCCESS : ProcessResult.PROCESS_RESULT_FAILURE;
    }
}