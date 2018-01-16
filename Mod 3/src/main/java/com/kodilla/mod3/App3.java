package com.kodilla.mod3;

import java.util.Random;

public class App3 {

    public static void main(String[] args) {
        int sumaA = 1000;
        int sumaB = 0;
        int tryCounter = 0;
        Random randomGenerator = new Random();
        while (sumaA > sumaB){
            tryCounter++;
            System.out.println("sumaA > sumaB: " + sumaA + " > " + sumaB + " : [loop # " + tryCounter + "]");
            sumaA = sumaA + randomGenerator.nextInt(10);
            sumaB = sumaB + randomGenerator.nextInt(50);
        }
        System.out.println("End of loop while, sumaA !> sumaB: " + sumaA + " !> " + sumaB);
    }
}
