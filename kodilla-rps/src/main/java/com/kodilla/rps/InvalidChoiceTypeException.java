package com.kodilla.rps;

public class InvalidChoiceTypeException extends Exception {
    public InvalidChoiceTypeException() {
        super("Provided invalid choice type in game.");
    }
}