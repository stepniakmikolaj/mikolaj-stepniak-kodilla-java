package com.kodilla.sudoku;

public class SudokuSolver {
    private SudokuBoard sudokuBoard;

    public SudokuSolver(final SudokuBoard sudokuBoard) {
        this.sudokuBoard = sudokuBoard;
    }

    boolean isAvailable(final int row, final int column, final int value) {
        boolean isAvailable = true;
        for (int i = 0; i < 9; i++) {
            if (value == sudokuBoard.getElement(row, i).getValue() || value == sudokuBoard.getElement(i, column).getValue()) {
                isAvailable = false;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (value == sudokuBoard.getElement(row / 3 * 3 + i, column / 3 * 3 + j).getValue()) {
                    isAvailable = false;
                }
            }
        }
        return isAvailable;
    }

    /**
     * Iterates the sudoku board to search of value.
     *
     * @param row    row in sudoku board.
     * @param column column in sudoku board.
     * @return direct place next sudoku element to fill.
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
     * Solve sudoku, set correct value in appropriate row and column.
     *
     * @param row    row in sudoku board.
     * @param column column in sudoku board.
     * @return sudoku element.
     */
    public boolean solveSudoku(final int row, final int column) {
        SudokuElement sudokuElement = sudokuBoard.getElement(row, column);
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