package com.kodilla.good.patterns.challenges.food2door;

public class Product {

    private final SupplierType supplierType;
    private final String nameProduct;
    private final double price;

    public Product(final SupplierType supplierType, final String nameProduct, final double price) {
        this.supplierType = supplierType;
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public SupplierType getSupplierType() {
        return supplierType;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "supplierType=" + supplierType +
                ", nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                '}';
    }
}
