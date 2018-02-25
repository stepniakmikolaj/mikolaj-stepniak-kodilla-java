package com.kodilla.rps;

import com.kodilla.rps.exception.InvalidChoiceTypeException;

public enum ChoiceType {
    SCISSORS("3"), PAPER("2"), ROCK("1"), DEFAULT("0");

    private final String id;

    ChoiceType(final String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public static ChoiceType getChoiceByValue(String value) throws InvalidChoiceTypeException {
        for (ChoiceType type : ChoiceType.values()) {
            if (type.getId().equalsIgnoreCase(value)) {
                return type;
            }
        }
        throw new InvalidChoiceTypeException();
    }
}
