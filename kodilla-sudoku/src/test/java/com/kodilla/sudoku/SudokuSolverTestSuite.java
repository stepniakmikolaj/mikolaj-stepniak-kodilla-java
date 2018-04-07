package com.kodilla.sudoku;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class SudokuSolverTestSuite {
    @Test
    public void isAvailable() {
        // Given
        SudokuGameCode sudokuGameCode = new SudokuGameCode();
        SudokuBoard sudokuBoard = sudokuGameCode.createNewGame();

        // When

        sudokuBoard.getElement(0,0).setValue(1);
        SudokuSolver sudokuSolver = new SudokuSolver(sudokuBoard);

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
        SudokuBoard sudokuBoard = sudokuGameCode.createNewGame();
        SudokuSolver sudokuSolver = new SudokuSolver(sudokuBoard);

        // When and Then
        assertTrue(sudokuSolver.nextSudokuElement(8,8));
        assertTrue(sudokuSolver.nextSudokuElement(1,1));
        assertTrue(sudokuSolver.nextSudokuElement(1,8));
    }

    @Test
    public void solveSudoku() {
        // Given
        SudokuGameCode sudokuGameCode = new SudokuGameCode();
        SudokuBoard sudokuBoardSolvable = sudokuGameCode.createNewGame();
        SudokuBoard sudokuBoardUnsolvable = sudokuGameCode.createNewGame();

        // When
        SudokuSolver goodSudokuSolver = new SudokuSolver(sudokuBoardSolvable);

        sudokuBoardUnsolvable.getElement(0,0).setValue(1);
        sudokuBoardUnsolvable.getElement(0,1).setValue(2);
        sudokuBoardUnsolvable.getElement(0,2).setValue(3);
        sudokuBoardUnsolvable.getElement(0,3).setValue(4);
        sudokuBoardUnsolvable.getElement(0,4).setValue(5);
        sudokuBoardUnsolvable.getElement(0,5).setValue(6);
        sudokuBoardUnsolvable.getElement(0,6).setValue(7);
        sudokuBoardUnsolvable.getElement(0,7).setValue(8);
        sudokuBoardUnsolvable.getElement(0,8).setValue(9);
        sudokuBoardUnsolvable.getElement(1,0).setValue(4);
        sudokuBoardUnsolvable.getElement(1,1).setValue(5);
        sudokuBoardUnsolvable.getElement(1,2).setValue(6);
        sudokuBoardUnsolvable.getElement(1,3).setValue(1);
        sudokuBoardUnsolvable.getElement(1,4).setValue(2);
        sudokuBoardUnsolvable.getElement(1,5).setValue(3);

        sudokuGameCode.printSudokuBoard();

        SudokuSolver badSudokuSolver = new SudokuSolver(sudokuBoardUnsolvable);

        // Then
        assertTrue(goodSudokuSolver.solveSudoku(0,0));
        assertFalse(badSudokuSolver.solveSudoku(0,0));
    }
}