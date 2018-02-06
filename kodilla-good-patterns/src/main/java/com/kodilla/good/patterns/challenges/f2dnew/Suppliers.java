package com.kodilla.good.patterns.challenges.f2dnew;

public enum Suppliers {

    EXTRA_FOOD_SHOP(new Product("Coconut Milk", 9.99)),
    HEALTHY_FOOD_SHOP(new Product("Milk", 5.99)),
    GLUTEN_FREE_FOOD_SHOP(new Product("Gluten Free Milk", 5.99));

    Product product;

    Suppliers(Product product) {
        this.product = product;
    }
}
