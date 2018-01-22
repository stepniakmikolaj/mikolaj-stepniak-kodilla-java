package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {

        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {

        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(new Circle(3.6));
        //Then
        assertEquals(1, shapeCollector.shapeQuantity());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle(6.5, 4.5);
        shapeCollector.addFigure(triangle);
        Shape square = new Square(5.8);
        shapeCollector.addFigure(square);
        //When
        boolean result = shapeCollector.removeFigure(triangle);
        //Then
        assertTrue(result);
        assertEquals(1, shapeCollector.shapeQuantity());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square(3.6);
        shapeCollector.addFigure(square);
        //When
        Shape result = shapeCollector.getFigure(0);
        //Then
        assertEquals(result, square);
    }

    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle(3.0));
        shapeCollector.addFigure(new Triangle(6.5, 4.5));
        shapeCollector.addFigure(new Square(3.6));
        //When
        String expectedResault = "Circle 9.42\n" + "Triangle 14.625\n" + "Square 12.96\n";
        //Then
        assertEquals(expectedResault, shapeCollector.showFigures());
    }

}
