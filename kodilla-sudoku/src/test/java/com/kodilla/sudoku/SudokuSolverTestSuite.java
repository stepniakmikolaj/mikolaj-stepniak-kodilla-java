package com.kodilla.sudoku;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class SudokuSolverTestSuite {
    @Test
    public void isAvailable() {
        // Given
        SudokuGameCode sudokuGameCode = new SudokuGameCode();
        List<List<SudokuElement>> sudokuArray = sudokuGameCode.createNewGame();

        // When

        sudokuArray.get(0).get(0).setValue(1);
        SudokuSolver sudokuSolver = new SudokuSolver(sudokuArray);

        // Then
        assertFalse(sudokuSolver.isAvailable(0,0,1));
        assertFalse(sudokuSolver.isAvailable(0,1,1));
        assertFalse(sudokuSolver.isAvailable(0,2,1));
        assertFalse(sudokuSolver.isAvailable(1,0,1));
        assertFalse(sudokuSolver.isAvailable(2,0,1));
        assertTrue(sudokuSolver.isAvailable(3,3,1));
        assertTrue(sudokuSolver.isAvailable(8,8,1));
    }

    @Test
    public void nextSudokuElement() {
        // Given
        SudokuGameCode sudokuGameCode = new SudokuGameCode();
        List<List<SudokuElement>> sudokuArray = sudokuGameCode.createNewGame();
        SudokuSolver sudokuSolver = new SudokuSolver(sudokuArray);

        // When and Then
        assertTrue(sudokuSolver.nextSudokuElement(8,8));
        assertTrue(sudokuSolver.nextSudokuElement(1,1));
        assertTrue(sudokuSolver.nextSudokuElement(1,8));
    }

    @Test
    public void solveSudoku() {
        // Given
        SudokuGameCode sudokuGameCode = new SudokuGameCode();
        List<List<SudokuElement>> sudokuArraySolvable = sudokuGameCode.createNewGame();
        List<List<SudokuElement>> sudokuArrayUnsolvable = sudokuGameCode.createNewGame();

        // When
        SudokuSolver goodSudokuSolver = new SudokuSolver(sudokuArraySolvable);

        sudokuArrayUnsolvable.get(0).get(0).setValue(1);
        sudokuArrayUnsolvable.get(0).get(1).setValue(2);
        sudokuArrayUnsolvable.get(0).get(2).setValue(3);
        sudokuArrayUnsolvable.get(0).get(3).setValue(4);
        sudokuArrayUnsolvable.get(0).get(4).setValue(5);
        sudokuArrayUnsolvable.get(0).get(5).setValue(6);
        sudokuArrayUnsolvable.get(0).get(6).setValue(7);
        sudokuArrayUnsolvable.get(0).get(7).setValue(8);
        sudokuArrayUnsolvable.get(0).get(8).setValue(9);
        sudokuArrayUnsolvable.get(1).get(0).setValue(4);
        sudokuArrayUnsolvable.get(1).get(1).setValue(5);
        sudokuArrayUnsolvable.get(1).get(2).setValue(6);
        sudokuArrayUnsolvable.get(1).get(3).setValue(1);
        sudokuArrayUnsolvable.get(1).get(4).setValue(2);
        sudokuArrayUnsolvable.get(1).get(5).setValue(3);

        sudokuGameCode.printArray();

        SudokuSolver badSudokuSolver = new SudokuSolver(sudokuArrayUnsolvable);

        // Then
        assertTrue(goodSudokuSolver.solveSudoku(0,0));
        assertFalse(badSudokuSolver.solveSudoku(0,0));
    }
}