package com.kodilla.good.patterns.challenges.f2dnew;

import java.util.*;

public class OrderRequestRetriever {
    private final Map<Suppliers, List<Order>> orderRequests;

    public OrderRequestRetriever() {
        orderRequests = new HashMap<>();


        List<Order> extraFoodOrders = Collections.singletonList(
                new Order(Suppliers.EXTRA_FOOD_SHOP, 2));
        List<Order> healthyFoodOrders = Collections.singletonList(
                new Order(Suppliers.HEALTHY_FOOD_SHOP, 1));
        List<Order> glutenFreeOrders = Collections.singletonList(
                new Order(Suppliers.GLUTEN_FREE_FOOD_SHOP, 4));

        orderRequests.put(Suppliers.EXTRA_FOOD_SHOP, extraFoodOrders);
        orderRequests.put(Suppliers.HEALTHY_FOOD_SHOP, healthyFoodOrders);
        orderRequests.put(Suppliers.GLUTEN_FREE_FOOD_SHOP, glutenFreeOrders);
    }

    public Map<Suppliers, List<Order>> retrieve() {
        return orderRequests;
    }
}

