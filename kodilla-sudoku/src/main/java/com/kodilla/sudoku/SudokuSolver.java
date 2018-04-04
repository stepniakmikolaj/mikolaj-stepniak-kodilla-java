package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuSolver {
    List<List<SudokuElement>> sudokuArray = new ArrayList<>();

    public SudokuSolver(final List<List<SudokuElement>> sudokuArray) {
        this.sudokuArray = sudokuArray;
    }

    boolean isAvailable(final int row, final int column, final int value) {
        boolean isAvailable = true;
        for (int i = 0; i < 9; i++) {
            if (value == sudokuArray.get(row).get(i).getValue() || value == sudokuArray.get(i).get(column).getValue()) {
                isAvailable = false;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (value == sudokuArray.get(row / 3 * 3 + i).get(column / 3 * 3 + j).getValue()) {
                    isAvailable = false;
                }
            }
        }
        return isAvailable;
    }

    /**
     * opis metody.
     * @param row opis parametru.
     * @param column opis parametru.
     * @return zwraca to.
     */
    public boolean nextSudokuElement(final int row, final int column) {
        if (row == 8 && column == 8) {
            return true;
        } else if (column == 8) {
            return solveSudoku(row + 1, 0);
        } else {
            return solveSudoku(row, column + 1);
        }
    }

    /**
     * opis metody.
     * @param row opis parametru.
     * @param column opis parametru.
     * @return zwraca to.
     */
    public boolean solveSudoku(final int row, final int column) {
        SudokuElement sudokuElement = sudokuArray.get(row).get(column);
        if (sudokuElement.getValue() == 0) {
            for (int i = 1; i < 10; i++) {
                if (isAvailable(row, column, i)) {
                    sudokuElement.setValue(i);
                    if (nextSudokuElement(row, column)) {
                        return true;
                    }
                }
            }
            sudokuElement.setValue(0);
            return false;
        }
        return nextSudokuElement(row, column);
    }
}