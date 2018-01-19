package com.kodilla.testing.collection;

import java.util.ArrayList;

/*
W katalogu src/main/java utwórz pakiet com.kodilla.testing.collection
W utworzonym pakiecie stwórz klasę OddNumbersExterminator
posiadającą metodę exterminate(ArrayList<Integer> numbers)
przyjmującą jako argument kolekcję ArrayList liczb typu Integer,
która zwraca również kolekcję ArrayList liczb typu Integer,
stanowiącą podzbiór kolekcji wejściowej z pominięciem liczb nieparzystych.
*/
public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }
}
