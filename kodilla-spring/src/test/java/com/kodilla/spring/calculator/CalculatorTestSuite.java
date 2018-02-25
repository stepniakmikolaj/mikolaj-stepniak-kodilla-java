package com.kodilla.spring.calculator;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
public class CalculatorTestSuite {

    @Test
    public void testAdd() {
        //G
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //W
        double result = calculator.add(10.0, 5.0);
        //T
        assertEquals(15.0, result, 0.01);
    }

    @Test
    public void testSub() {
        //G
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //W
        double result = calculator.sub(10.0, 5.0);
        //T
        assertEquals(5.0, result, 0.01);
    }

    @Test
    public void testMul() {
        //G
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //W
        double result = calculator.mul(10.0, 5.0);
        //T
        Assert.assertEquals(50.0, result, 0.01);
    }

    @Test
    public void testDiv() {
        //G
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //W
        double result = calculator.div(10.0, 5.0);
        //T
        assertEquals(2.0, result, 0.01);
    }
}