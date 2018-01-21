package com.kodilla.testing.shape;

public class Square implements Shape {
    Double lenghtA;

    public Square(Double a) {
        this.lenghtA = lenghtA;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public Double getField() {
        return Math.pow(lenghtA,2.0);
    }
}
