package com.kodilla.sudoku;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SudokuGameCodeTestSuite {
    /**
     * Print all availabilities numbers in sudoku.
     *
     * @param sudokuBoard sudoku board.
     */
    public void printAllAvailabilities(final SudokuBoard sudokuBoard) {
        String availableArray;

        for (int rowIndex = 0; rowIndex < 9; rowIndex++) {
            for (int columnIndex = 0; columnIndex < 9; columnIndex++) {
                availableArray = sudokuBoard.getElement(rowIndex, columnIndex).getAvailableValues().toString();
                StringBuffer buf = new StringBuffer();
                for (int i = availableArray.length(); i < 29; i++) {
                    buf.append(availableArray = availableArray + " ");
                }
                System.out.print(availableArray + " ");
            }
            System.out.println("\n");
        }
    }

    @Test
    public void testFillSudokuArrayFirst3x3() {
        //Given
        SudokuGameCode sudokuGameCode = new SudokuGameCode();
        sudokuGameCode.createNewGame();

        //When

        sudokuGameCode.fillSudokuBoard("111,122,133,214,225,236,317,328,");
        sudokuGameCode.printSudokuBoard();

        //Then
        printAllAvailabilities(sudokuGameCode.getSudokuBoard());

        int expectedValue3x3 = sudokuGameCode.getSudokuBoard().getElement(2, 2).getAvailableValues().get(0);
        List<Integer> expectedValue9x1 = sudokuGameCode.getSudokuBoard().getElement(8, 0).getAvailableValues();

        assertEquals(9, expectedValue3x3);
        assertEquals(6, expectedValue9x1.size());
    }

    @Test
    public void testSudokuElementAvailableValues() {
        //Given
        SudokuGameCode sudokuGameCode = new SudokuGameCode();
        sudokuGameCode.createNewGame();

        //When

        sudokuGameCode.fillSudokuBoard("441,452,463,544,555,566,647,658,669,");
        sudokuGameCode.printSudokuBoard();

        //Then
        printAllAvailabilities(sudokuGameCode.getSudokuBoard());

        List<Integer> expectedList6x6 = sudokuGameCode.getSudokuBoard().getElement(5, 5).getAvailableValues();
        int expectedValue6x6 = expectedList6x6.get(0);

        assertEquals(1, expectedList6x6.size());
        assertEquals(0, expectedValue6x6);
    }

    @Test
    public void testSudokuArrayModification() {
        //Given
        SudokuGameCode sudokuGameCode = new SudokuGameCode();
        sudokuGameCode.createNewGame();

        //When
        sudokuGameCode.fillSudokuBoard("441,442,443,444,555,556,997,998,999,");
        sudokuGameCode.printSudokuBoard();

        //Then
        printAllAvailabilities(sudokuGameCode.getSudokuBoard());

        List<Integer> expectedList6x6 = sudokuGameCode.getSudokuBoard().getElement(5, 5).getAvailableValues();
        int expectedValue6x6 = expectedList6x6.get(0);

        assertEquals(7, expectedList6x6.size());
        assertEquals(7, expectedValue6x6);
    }
}