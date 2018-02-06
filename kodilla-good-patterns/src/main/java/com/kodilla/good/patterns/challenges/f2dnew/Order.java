package com.kodilla.good.patterns.challenges.f2dnew;

public class Order {
    Suppliers suppliers;
    double quantity;

    public Order(Suppliers suppliers, double quantity) {
        this.suppliers = suppliers;
        this.quantity = quantity;
    }

    public Suppliers getSuppliers() {
        return suppliers;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "suppliers=" + suppliers +
                ", quantity=" + quantity +
                '}';
    }
}
