package com.kodilla.good.patterns.challenges.food2door;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRequestRetriever {
    private final Map<String, List<Order>> orderRequests;

    public OrderRequestRetriever() {
        orderRequests = new HashMap<>();


        List<Order> extraFoodOrders = Arrays.asList(
                new Order(new Product("Chicken salad", 29.99), 0.25),
                new Order(new Product("Fresh orange juice", 9.99), 0.5));
        List<Order> healthyFoodOrders = Arrays.asList(
                new Order(new Product("2500 kcal Box", 45), 1),
                new Order(new Product("1800 kcal Box", 35), 2));
        List<Order> glutenFreeOrders = Arrays.asList(
                new Order(new Product("Gluten free breath", 5.49), 2),
                new Order(new Product("Gluten free cereal", 5.99), 4));

        orderRequests.put(Suppliers.EXTRA_FOOD_SHOP, extraFoodOrders);
        orderRequests.put(Suppliers.HEALTHY_FOOD_SHOP, healthyFoodOrders);
        orderRequests.put(Suppliers.GLUTEN_FREE_FOOD_SHOP, glutenFreeOrders);
    }

    public Map<String, List<Order>> retrieve() {
        return new HashMap<>(orderRequests);
    }
}

