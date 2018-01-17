package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;

import com.kodilla.testing.calculator.Calculator;


public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser", "Jonny Cage","Male");

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
        int substractResult = calculator.substract(24, 9);

        if ((addResult == 15) && (substractResult == 15)) {
            System.out.println("Test Ok");
        } else {
            System.out.println("Error!");
        }


    }
}