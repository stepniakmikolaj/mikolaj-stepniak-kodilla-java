package com.kodilla.mod2;

public class App2 {

    public static void main(String[] args) {

        int primitiveNumber = 10;
        char primitiveLetter = 'A';
        double primitiveDecimalNumber = 10.123456789;

        Integer wrraperNumber = 10;
        Character wrraperLetter = 'A';
        Double wrapperDecimalNumber = 10.123456789;


        System.out.println("Checking int " + primitiveNumber + " = Integer " + wrraperNumber + " : " + (primitiveNumber == wrraperNumber));

        System.out.println("Checking czy char " + primitiveLetter + " = Character " + wrraperLetter + " : " + (primitiveLetter == wrraperLetter));

        System.out.println("Checking czy double " + primitiveDecimalNumber + " = Double " + wrapperDecimalNumber + " : " + (primitiveDecimalNumber == wrapperDecimalNumber));
    }
}
