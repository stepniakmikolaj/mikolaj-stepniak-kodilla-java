package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Random;

public class OddNumbersExterminator {


    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers, int value) {
        ArrayList<Integer> theList = new ArrayList<Integer>();
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

        Random theGenerator = new Random();

        for (int i = 0; i < value; i++) {
            theList.add(theGenerator.nextInt(11111));
        }

        for (int i = 0; i < theList.size(); i++) {
            int number = theList.get(i);
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return theList;
    }
}
