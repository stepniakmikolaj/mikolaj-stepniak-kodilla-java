package com.kodilla.mod3;

public class App4 {
    public static void main(String[] args) {

        LetterRandomFillA nazwa = new LetterRandomFillA(50);
        nazwa.generateRandomALetters();

        LetterRandomFillA nazwa1 = new LetterRandomFillA(100);
        nazwa1.generateRandomALetters();

        Separation sort = new Separation();
        sort.separateForTwoCollections(nazwa.getLettersA());

        Separation sort1 = new Separation();
        sort1.separateForTwoCollections(nazwa1.getLettersA());
    }
}