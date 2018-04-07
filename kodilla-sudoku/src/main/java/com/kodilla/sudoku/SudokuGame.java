package com.kodilla.sudoku;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class SudokuGame {
    /**
     * Main method to start game.
     *
     * @param args the command line arguments.
     */
    public static void main(final String[] args) {

        boolean gameFinished = false;
        SudokuBoard sudokuBoard;

        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8.name());
        CommandValidator commandValidator = new CommandValidator();
        SudokuGameCode sudokuGameCode = new SudokuGameCode();

        sudokuBoard = sudokuGameCode.createNewGame();

        while (!gameFinished) {
            sudokuGameCode.printSudokuBoard();
            String command = scanner.nextLine();
            switch (command) {
                case "new game":
                    sudokuBoard = sudokuGameCode.createNewGame();
                    break;
                case "sudoku":
                    SudokuSolver sudokuSolver = new SudokuSolver(sudokuBoard);
                    if (sudokuSolver.solveSudoku(0, 0)) {
                        for (int i = 0; i < 9; i++) {
                            for (int j = 0; j < 9; j++) {
                                sudokuBoard.getElement(i, j).getAvailableValues().clear();
                                sudokuBoard.getElement(i, j).getAvailableValues().add(0);
                            }
                        }
                    } else {
                        System.out.println("Array has no solution! please modify an element..");
                    }
                    break;
                case "exit":
                    gameFinished = true;
                    break;
                default:
                    if (commandValidator.validate(command)) {
                        sudokuBoard = sudokuGameCode.fillSudokuBoard(command);
                    }
            }
        }
    }
}