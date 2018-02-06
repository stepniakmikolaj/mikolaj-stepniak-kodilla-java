package com.kodilla.good.patterns.challenges.f2dnew;

public class Product {
    String nameProduct;
    double price;

    public Product(String nameProduct, double price) {
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public String getName() {
        return nameProduct;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                '}';
    }
}
