package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private Double height;
    private Double lenghtA;

    public Triangle(Double height, Double lenghtA) {
        this.height = height;
        this.lenghtA = lenghtA;
    }

    @Override
    public String getShapeName() {

        return "Triangle";
    }

    @Override
    public Double getField() {

        return ((0.5 * lenghtA) * height);
    }
}
