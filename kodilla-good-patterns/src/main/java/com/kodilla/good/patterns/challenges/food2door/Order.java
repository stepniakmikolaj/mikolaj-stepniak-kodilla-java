package com.kodilla.good.patterns.challenges.food2door;

public class Order {
    Product product;
    double quantity;

    public Order(Product product, double quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "\nOrder{" +
                "product=" + product +
                ", quantity=" + quantity +
                "}";
    }
}