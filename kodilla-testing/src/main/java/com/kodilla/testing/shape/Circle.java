package com.kodilla.testing.shape;

public class Circle implements Shape {
    Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public Double getField() {
        return radius * 3.14;
    }
}
