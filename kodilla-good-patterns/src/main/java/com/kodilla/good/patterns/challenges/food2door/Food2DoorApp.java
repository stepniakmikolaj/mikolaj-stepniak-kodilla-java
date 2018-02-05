package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;
import java.util.Map;

public class Food2DoorApp {

    public static void main(String[] args) {
        OrderService extraFoodService = (orders) -> {
            System.out.println("Processing Orders from "  + Suppliers.EXTRA_FOOD_SHOP + "..." + orders);
            return false;
        };
        OrderService healthyFoodService = (orders) -> {
            System.out.println("Processing Orders from "  + Suppliers.HEALTHY_FOOD_SHOP + "..." + orders);
            return true;
        };
        OrderService glutenFreeFoodService = (orders) -> {
            System.out.println("Processing Orders from "  + Suppliers.GLUTEN_FREE_FOOD_SHOP + "..." + orders);
            return true;
        };

        OrderRequestRetriever requestRetriever = new OrderRequestRetriever();
        Map<String, List<Order>> orders = requestRetriever.retrieve();

        SupplierProcessor extraFoodProcessor = new SupplierProcessor(extraFoodService);
        SupplierProcessor healthyFoodProcessor = new SupplierProcessor(healthyFoodService);
        SupplierProcessor glutenFreeFoodProcessor = new SupplierProcessor(glutenFreeFoodService);

        extraFoodProcessor.process(orders.get(Suppliers.EXTRA_FOOD_SHOP));
        extraFoodProcessor.orderProcessResult();
        healthyFoodProcessor.process(orders.get(Suppliers.HEALTHY_FOOD_SHOP));
        healthyFoodProcessor.orderProcessResult();
        glutenFreeFoodProcessor.process(orders.get(Suppliers.GLUTEN_FREE_FOOD_SHOP));
        glutenFreeFoodProcessor.orderProcessResult();
    }
}