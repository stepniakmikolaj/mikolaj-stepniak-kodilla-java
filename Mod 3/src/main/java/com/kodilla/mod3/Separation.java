package com.kodilla.mod3;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Separation {

    ArrayList<String> oddCollection = new ArrayList<String>();

    ArrayList<String> evenCollection = new ArrayList<String>();

    public void separateForTwoCollections(ArrayDeque<String> getLettersA) {

        String temporaryValue = "";

        for (String lettersA : getLettersA) {

            temporaryValue = getLettersA.poll();

            if (temporaryValue.length() % 2 == 0) {

                evenCollection.add(temporaryValue);

            } else {

                oddCollection.add(temporaryValue);

            }
        }


        System.out.println("\nLitery wezykiem:\n");

        for (int i = 0; i < evenCollection.size(); i++) {

            System.out.println((i + 1) + ". " + "Even: " + evenCollection.get(i));
        }
        System.out.println("");

        for (int i = 0; i < oddCollection.size(); i++) {

            System.out.println((i + 1) + ". " + "Odd: " + oddCollection.get(i));
        }
    }
}