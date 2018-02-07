package com.kodilla.spring;

import com.kodilla.spring.shape.Circle;
import com.kodilla.spring.shape.Shape;
import com.kodilla.spring.shape.Square;
import com.kodilla.spring.shape.Triangle;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRunnerTests {

    @Test
    public void testCircleLoadedIntoContainer() {
        //G
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape) context.getBean("circle");
        //W
        String name = shape.getShapeName();
        //T
        assertEquals("Circle", name);
    }

    @Test
    public void testTriangleLoadedIntoContainer() {
        //G
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape) context.getBean("triangle");
        //W
        String name = shape.getShapeName();
        //T
        assertEquals("Triangle", name);
    }

    @Test
    public void testSquareLoadedIntoContainer() {
        //G
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape) context.getBean("createSquare");
        //W
        String name = shape.getShapeName();
        //T
        assertEquals("Square", name);
    }

    @Test
    public void testShapeLoadedIntoContainer() {
        //G
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape) context.getBean("choosenShape");
        //W
        String name = shape.getShapeName();
        //T
        System.out.println("Random shape: " + name);
    }

}
