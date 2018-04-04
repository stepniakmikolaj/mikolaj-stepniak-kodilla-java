package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuElement {
    private List<Integer> availableValues = new ArrayList<>();
    private int value;

    /**
     * Adds available values different from user value.
     *
     * @param value user command value.
     */
    public SudokuElement(final int value) {
        this.value = value;
        for (int i = 0; i < 10; i++) {
            if (i != value) {
                availableValues.add(i);
            }
        }
    }

    public final boolean isAvailable(final int value) {
        return availableValues.stream().anyMatch(t -> t == value);
    }

    /**
     * Set value in board.
     *
     * @param value user command value.
     * @return true or false.
     */
    public boolean setValue(final int value) {
        if (isAvailable(value) || value == 0) {
            addToAvailableValues(this.value);
            this.value = value;
            for (int i = 0; i < availableValues.size(); i++) {
                if (availableValues.get(i) == value) {
                    availableValues.remove(i);
                }
            }
            return true;
        } else {
            return false;
        }
    }

    /**
     * Remove from available values.
     *
     * @param value user command value.
     */
    public void removeFromAvailableValues(final int value) {
        if (isAvailable(value)) {
            for (int i = 0; i < availableValues.size(); i++) {
                if (availableValues.get(i) == value) {
                    availableValues.remove(i);
                }
            }
        }
    }

    /**
     * Add to available values.
     *
     * @param value user command value.
     */
    public void addToAvailableValues(final int value) {
        if (!isAvailable(value)) {
            availableValues.add(value);
        }
    }

    public int getValue() {
        return this.value;
    }

    public List<Integer> getAvailableValues() {
        return availableValues;
    }
}