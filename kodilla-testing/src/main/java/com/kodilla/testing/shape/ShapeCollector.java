package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> theList = new ArrayList<Shape>();

    public void addFigure(Shape shape){
        theList.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        return theList.remove(shape);
    }

    public Shape getFigure(int n) {
        return theList.get(n);
    }

    public void showFigures(){
        for (Shape s: theList) {
            System.out.println(s.getShapeName() + s.getField());
        }
    }

    public int shapeQuantity() {
        return theList.size();
    }
}
