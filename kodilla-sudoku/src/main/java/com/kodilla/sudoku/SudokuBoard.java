package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {
    private List<SudokuRow> sudokuRows = new ArrayList<>();

    public void addRow(final List<SudokuElement> sudokuElementList) {
        sudokuRows.add(new SudokuRow(sudokuElementList));
    }

    public SudokuElement getElement(final int row, final int column) {
        return sudokuRows.get(row).getElement(column);
    }

    public SudokuRow getRow(final int rowIndex) {
        return sudokuRows.get(rowIndex);
    }
}
