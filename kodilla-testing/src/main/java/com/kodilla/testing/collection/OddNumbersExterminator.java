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

    ArrayList<Integer> numbers = new ArrayList<Integer>();
    ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
    ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

    public int emptyList() {
        return numbers.size();
    }

    for(int i = 1; i< 9; i++)

    { // ma dodać liczby do listy 1,2,3,4,5,6,7,8. czyli 8 liczb
        numbers.add(i);
    }

    public int normalList() {
        return numbers.size();
    }

    for(
    Integer number: numbers)/*each po kolei przez numbers*/

    {
        if (numbers / 2 == 0)
            evenNumbers.add();
    } else

    {
        oddNumbers.add();
    }

    public int evenNumbers() {
        return evenNumbers.size();
    }

    public int oddNumbers() {
        return oddNumbers.size();
    }

}
