package com.kodilla.patterns.factory;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeFactoryTestSuite {

    @Test
    public void testFactoryCircle() {
        //G
        ShapeFactory factory = new ShapeFactory();
        //W
        Shape circle = factory.makeShape(ShapeFactory.CIRCLE);
        //T
        assertEquals(Math.PI * Math.pow(4.50, 2.0), circle.getField(), 0);
        assertEquals("The rounded circle", circle.getName());
    }

    @Test
    public void testFactorySquare() {
        //G
        ShapeFactory factory = new ShapeFactory();
        //W
        Shape square = factory.makeShape(ShapeFactory.SQUARE);
        //T
        assertEquals(49, square.getField(), 0);
        assertEquals(28, square.getCircumference(), 0);
        assertEquals("The angular square", square.getName());
    }

    @Test
    public void testFactoryRectangle() {
        //G
        ShapeFactory factory = new ShapeFactory();
        //W
        Shape rectangle = factory.makeShape(ShapeFactory.RECTANGLE);
        //T
        assertEquals(37.50, rectangle.getField(), 0);
        assertEquals(35, rectangle.getCircumference(),0);
        assertEquals("The long rectangle", rectangle.getName());
    }
}