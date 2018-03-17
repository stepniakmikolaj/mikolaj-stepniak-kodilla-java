package com.kodilla.rps;

public enum Shapes {
    SCISSORS("3"), PAPER("2"), ROCK("1");

    private final String text;

    Shapes(final String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public static Shapes getChoiceByValue(String value) throws InvalidChoiceTypeException {
        for (Shapes type : Shapes.values()) {
            if (type.getText().equalsIgnoreCase(value)) {
                return type;
            }
        }
        throw new InvalidChoiceTypeException();
    }
}