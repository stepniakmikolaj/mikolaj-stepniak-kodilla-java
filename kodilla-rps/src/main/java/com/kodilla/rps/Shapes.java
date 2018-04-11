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

    /**
     * change random int to computer choice.
     *
     * @param value stores random int.
     * @return type.
     */
    public static Shapes getChoiceByValue(final String value) {
        for (Shapes type : Shapes.values()) {
            if (type.getText().equalsIgnoreCase(value)) {
                return type;
            }
        }
        return Shapes.getChoiceByValue(value);
    }
}