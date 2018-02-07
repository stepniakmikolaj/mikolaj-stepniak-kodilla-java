package com.kodilla.rps.exception;

public class InvalidChoiceTypeException extends Exception {
    public InvalidChoiceTypeException() {
        super("Provided invalid choice type in game.");
    }
}
