package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuGameCode {
    private static final int EMPTY = 0;
    private SudokuBoard sudokuBoard;
    private int subArrayRowOffset;
    private int subArrayColumnOffset;

    /**
     * Prints sudoku board.
     */
    public void printSudokuBoard() {
        SudokuRow row;
        System.out.println("\n  _____________________________________SUDOKU SOLVER 1.0_____________________________________");
        System.out.println("  r \\ c    1   2   3   4   5   6   7   8   9           " +
                "|Sudoku Game Controllers:\n                                                       " +
                "|.....................................");
        for (int rowIndex = 0; rowIndex < 9; rowIndex++) {
            row = sudokuBoard.getRow(rowIndex);
            System.out.print("  " + (rowIndex + 1) + "      |");
            for (int columnIndex = 0; columnIndex < 9; columnIndex++) {
                if (row.getElement(columnIndex).getValue() == EMPTY) {
                    System.out.print("   |");
                } else {
                    System.out.print(" " + row.getElement(columnIndex).getValue() + " |");
                }
                if (columnIndex == 8) {
                    switch (rowIndex) {
                        case 0:
                            System.out.print("         |   r - row (1..9)");
                            break;
                        case 1:
                            System.out.print("         |   c - column (1..9)");
                            break;
                        case 2:
                            System.out.print("         |   v - value (1..9 or 0 to empty)");
                            break;
                        case 3:
                            System.out.print("         | type 'rcv,' to insert value");
                            break;
                        case 4:
                            System.out.print("         | type 'rcv,rcv,...,' to insert values");
                            break;
                        case 5:
                            System.out.print("         | type 'exit' to finish");
                            break;
                        case 6:
                            System.out.print("         | type 'sudoku' to find a solution");
                            break;
                        case 7:
                            System.out.print("         | type 'new game' to reset");
                            break;
                        case 8:
                            System.out.print("         |......................................");
                            break;
                        default:
                            System.out.println("default");
                            break;
                    }
                }
            }
            System.out.println("");
        }
        System.out.println("Enter here: ");
    }

    private void addToAffectedElements(final int currentValue, final int row, final int column) {
        for (int columnIndex = 0; columnIndex < 9; columnIndex++) {
            sudokuBoard.getElement(row, columnIndex).addToAvailableValues(currentValue);
        }
        for (int rowIndex = 0; rowIndex < 9; rowIndex++) {
            sudokuBoard.getElement(rowIndex, column).addToAvailableValues(currentValue);
        }
        for (int columnIndex = subArrayColumnOffset; columnIndex < subArrayColumnOffset + 3; columnIndex++) {
            for (int rowIndex = subArrayRowOffset; rowIndex < subArrayRowOffset + 3; rowIndex++) {
                sudokuBoard.getElement(rowIndex, columnIndex).addToAvailableValues(currentValue);
            }
        }
    }

    private void updateAffectedElements(final int currentValue, final int insertValue, final int row, final int column) {
        subArrayRowOffset = row / 3 * 3;
        subArrayColumnOffset = column / 3 * 3;

        if (currentValue != 0) {
            addToAffectedElements(currentValue, row, column);
        }
        for (int columnIndex = 0; columnIndex < 9; columnIndex++) {
            sudokuBoard.getElement(row, columnIndex).removeFromAvailableValues(insertValue);
        }
        for (int rowIndex = 0; rowIndex < 9; rowIndex++) {
            sudokuBoard.getElement(rowIndex, column).removeFromAvailableValues(insertValue);
        }
        for (int columnIndex = subArrayColumnOffset; columnIndex < subArrayColumnOffset + 3; columnIndex++) {
            for (int rowIndex = subArrayRowOffset; rowIndex < subArrayRowOffset + 3; rowIndex++) {
                sudokuBoard.getElement(rowIndex, columnIndex).removeFromAvailableValues(insertValue);
            }
        }
    }

    /**
     * Fills sudoku board and validate values.
     *
     * @param command user insert values.
     * @return validated values in board.
     */
    public SudokuBoard fillSudokuBoard(final String command) {
        int row;
        int column;
        int currentValue;
        int insertValue;

        try {
            for (int stringIndex = 0; stringIndex < command.length() / 4; stringIndex++) {
                row = Character.getNumericValue(command.charAt(stringIndex * 4)) - 1;
                column = Character.getNumericValue(command.charAt((stringIndex * 4) + 1)) - 1;
                currentValue = sudokuBoard.getElement(row, column).getValue();
                insertValue = Character.getNumericValue(command.charAt((stringIndex * 4) + 2));

                if (currentValue == insertValue) {
                    System.out.println("The value " + insertValue + " is already there at row " + (row + 1) + ", column " + (column + 1));
                } else {
                    if (sudokuBoard.getElement(row, column).setValue(insertValue)) {
                        updateAffectedElements(currentValue, insertValue, row, column);
                    } else {
                        System.out.println("Illegal to insert " + insertValue +
                                " to row " + (row + 1) + ", column " + (column + 1) +
                                " due to an other existing value. Please try something else..");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sudokuBoard;
    }

    /**
     * Create new game.
     *
     * @return empty sudoku board.
     */
    public SudokuBoard createNewGame() {

        sudokuBoard = new SudokuBoard();
        for (int rowIndex = 0; rowIndex < 9; rowIndex++) {
            List<SudokuElement> rowList = new ArrayList<>();
            for (int columnIndex = 0; columnIndex < 9; columnIndex++) {
                rowList.add(new SudokuElement(EMPTY));
            }
            sudokuBoard.addRow(rowList);
        }
        return sudokuBoard;
    }

    public SudokuBoard getSudokuBoard() {
        return sudokuBoard;
    }
}