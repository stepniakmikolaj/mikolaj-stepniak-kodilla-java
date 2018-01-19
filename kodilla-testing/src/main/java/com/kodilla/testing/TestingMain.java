package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;

import com.kodilla.testing.calculator.Calculator;


public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        System.out.println("Test theForumUser:");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test calculator:");

        Calculator calculator = new Calculator();

        int addResult = calculator.add(10, 5);
        int substractResult = calculator.subtract(24, 9);
        int multipyResult = calculator.multiply(3,5);
        int divideResult = calculator.divide(30,2);

        if (addResult == 15 || substractResult == 15 || multipyResult == 15 || divideResult == 15) {
            System.out.println("Calculator Ok");
        } else {
            System.out.println("Error!");
        }
    }
}