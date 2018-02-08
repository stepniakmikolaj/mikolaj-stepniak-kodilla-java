package com.kodilla.good.patterns.challenges.food2door;

import java.util.*;

public class Food2DoorApp {

    private static Map<SupplierType, SupplierProcessor> map = new HashMap<>();

    static {
        map.put(SupplierType.EXTRA_FOOD_SHOP, new SupplierProcessor((order) -> {
            System.out.println("Processing Orders from " + SupplierType.EXTRA_FOOD_SHOP + "..." + order);
            return false;
        }));
        map.put(SupplierType.HEALTHY_FOOD_SHOP, new SupplierProcessor((order) -> {
            System.out.println("Processing Orders from " + SupplierType.HEALTHY_FOOD_SHOP + "..." + order);
            return true;
        }));
        map.put(SupplierType.GLUTEN_FREE_FOOD_SHOP, new SupplierProcessor((order) -> {
            System.out.println("Processing Orders from " + SupplierType.GLUTEN_FREE_FOOD_SHOP + "..." + order);
            return false;
        }));
    }

    public static void processOrder(Order order) {
//        SupplierProcessor supplierProcessor = map.get(order.getProduct().getSupplierType());
//        supplierProcessor.process(Collections.singletonList(order));
        map.get(order.getProduct().getSupplierType()).processResult(order);
    }

    public static void main(String[] args) {

        Product product = new Product(SupplierType.GLUTEN_FREE_FOOD_SHOP, "Milk", 3.99);
        Order order = new Order(product, 12);
        processOrder(order);

    }
}