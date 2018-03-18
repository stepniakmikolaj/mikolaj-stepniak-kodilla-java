package com.kodilla.sudoku;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SudokuGameCodeTestSuite {

    public void printAllAvailabilities(List<List<SudokuElement>> sudokuArray) {
        String availableArray;

        for (int rowIndex = 0; rowIndex < 9; rowIndex++) {
            for (int columnIndex = 0; columnIndex < 9; columnIndex++) {
                availableArray = sudokuArray.get(rowIndex).get(columnIndex).getAvailableValues().toString();
                for (int i=availableArray.length(); i< 29; i++) {
                    availableArray = availableArray + " ";
                }
                System.out.print(availableArray + " ");
            }
            System.out.println("\n");
        }
    }

    @Test
    public void testFillSudokuArrayFirst3x3 () {
        //Given
        SudokuGameCode sudokuGameCode = new SudokuGameCode();
        sudokuGameCode.createNewGame();

        //When

        sudokuGameCode.fillSudokuArray("111,122,133,214,225,236,317,328,");
        sudokuGameCode.printArray();

        //Then
        printAllAvailabilities(sudokuGameCode.getSudokuArray());

        int expectedValue3x3 = sudokuGameCode.getSudokuArray().get(2).get(2).getAvailableValues().get(0);
        List<Integer> expectedValue9x1 = sudokuGameCode.getSudokuArray().get(8).get(0).getAvailableValues();

        assertEquals(9, expectedValue3x3);
        assertEquals(6, expectedValue9x1.size());
    }

    @Test
    public void testSudokuElementAvailableValues () {
        //Given
        SudokuGameCode sudokuGameCode = new SudokuGameCode();
        sudokuGameCode.createNewGame();

        //When

        sudokuGameCode.fillSudokuArray( "441,452,463,544,555,566,647,658,669,");
        sudokuGameCode.printArray();

        //Then
        printAllAvailabilities(sudokuGameCode.getSudokuArray());

        List<Integer> expectedList6x6 = sudokuGameCode.getSudokuArray().get(5).get(5).getAvailableValues();
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
        sudokuGameCode.fillSudokuArray("441,442,443,444,555,556,997,998,999,");
        sudokuGameCode.printArray();

        //Then
        printAllAvailabilities(sudokuGameCode.getSudokuArray());

        List<Integer> expectedList6x6 = sudokuGameCode.getSudokuArray().get(5).get(5).getAvailableValues();
        int expectedValue6x6 = expectedList6x6.get(0);

        assertEquals(7, expectedList6x6.size());
        assertEquals(7, expectedValue6x6);
    }
}