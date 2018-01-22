package com.kodilla.testing.shape;

public class Square implements Shape {
    private Double lenghtA;

    public Square(Double lenghtA) {

        this.lenghtA = lenghtA;
    }

    @Override
    public String getShapeName() {

        return "Square";
    }

    @Override
    public Double getField() {

        return Math.pow(lenghtA, 2);
    }
}
