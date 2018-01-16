package com.kodilla.mod2;

public class App1 {
    public static void main(String[] args) throws java.lang.Exception {
        int[] number = {10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190,200};
        double average;
        double sum = 0;

        for (int i = 0; i < number.length; i++) {
            System.out.println("Number[" + i + "] = " + number[i]);
        }

        for (int i = 0; i < number.length; i++) {
            sum += number[i];
        }

        average = sum / number.length;
        System.out.println("Sum value: " + sum);
        System.out.println("Average value: " + average);
    }
}
