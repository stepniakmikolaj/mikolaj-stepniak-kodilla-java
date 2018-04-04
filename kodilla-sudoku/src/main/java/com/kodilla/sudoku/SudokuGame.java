package com.kodilla.sudoku;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Scanner;

public class SudokuGame {
    /**
     * Main method to start game.
     * @param args all methods needed for run game.
     */
    public static void main(final String[] args) {

        boolean gameFinished = false;
        List<List<SudokuElement>> sudokuArray;

        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8.name());
        CommandValidator commandValidator = new CommandValidator();
        SudokuGameCode sudokuGameCode = new SudokuGameCode();

        sudokuArray = sudokuGameCode.createNewGame();

        while (!gameFinished) {
            sudokuGameCode.printArray();
            String command = scanner.nextLine();
            switch (command) {
                case "new game":
                    sudokuArray = sudokuGameCode.createNewGame();
                    break;
                case "sudoku":
                    SudokuSolver sudokuSolver = new SudokuSolver(sudokuArray);
                    if (sudokuSolver.solveSudoku(0,0)) {
                        for (int i = 0; i < 9; i++) {
                            for (int j = 0; j < 9; j++) {
                                sudokuArray.get(i).get(j).getAvailableValues().clear();
                                sudokuArray.get(i).get(j).getAvailableValues().add(0);
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
                        sudokuArray = sudokuGameCode.fillSudokuArray(command);
                    }
            }
        }
    }
}