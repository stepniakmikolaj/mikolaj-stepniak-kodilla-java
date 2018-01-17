package com.kodilla.mod3;

import java.util.ArrayDeque;
import java.util.Random;

public class LetterRandomFillA {

    ArrayDeque<String> lettersA = new ArrayDeque<>();

    Integer size;

    LetterRandomFillA(Integer size) {
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }

    ArrayDeque<String> getLettersA() {
        return lettersA;
    }

    public void generateRandomALetters() {

        Random theGenerator = new Random();

        for (int n = 0; n < size; n++) {

            StringBuilder lotsOfA = new StringBuilder();

            int aLettersCount = (theGenerator.nextInt(50) + 1);

            for (int k = 0; k < aLettersCount; k++) {

                lotsOfA.append("a");

            }

            lettersA.add(lotsOfA.toString());

        }
    }
}

