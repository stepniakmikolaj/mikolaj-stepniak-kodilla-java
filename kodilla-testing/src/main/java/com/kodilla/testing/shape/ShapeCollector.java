package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> theList = new ArrayList<Shape>();

    public void addFigure(Shape shape) {

        theList.add(shape);
    }

    public boolean removeFigure(Shape shape) {

        return theList.remove(shape);
    }

    public Shape getFigure(int n) {

        return theList.get(n);
    }

    public String showFigures() {
        StringBuilder result = new StringBuilder();
        for (Shape s : theList) {
            result.append(s.getShapeName())
                    .append(" ")
                    .append(s.getField())
                    .append("\n");
        }
        return result.toString();
    }

    public int shapeQuantity() {

        return theList.size();
    }
}
