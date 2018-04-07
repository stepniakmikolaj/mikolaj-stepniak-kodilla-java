package com.kodilla.sudoku;

import java.util.List;

public class SudokuRow {
    private List<SudokuElement> sudokuElements;

    public SudokuRow(final List<SudokuElement> sudokuElements) {
        this.sudokuElements = sudokuElements;
    }

    public SudokuElement getElement(final int column) {
        return sudokuElements.get(column);
    }

}
