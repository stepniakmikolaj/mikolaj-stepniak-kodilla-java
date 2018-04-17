package com.kodilla.rps;

import java.util.Scanner;

public class GameCode {
    private static final String EXIT = "x";
    private static final String NEW_GAME = "n";

    /**
     * game loop.
     *
     * @param display    get all needed display methods.
     * @param scanner    get values from player.
     * @param playerName playerName in game.
     * @return end game.
     */
    public boolean run(final Display display, final Scanner scanner, final String playerName) {
        int userScore = 0;
        int computerScore = 0;
        int roundsPerGame = display.askForNumberOfRounds(playerName);

        ValidateGameControllers validateGameControllers = new ValidateGameControllers();

        display.mainMenu();

        boolean end = false;
        boolean exit = false;
        String userInput;
        Shapes userShape;
        Shapes computerShape;
        ShapeGenerator shapeGenerator = new ShapeGenerator();
        while (!end) {
            userInput = validateGameControllers.validateGameInput(scanner.nextLine(), scanner, display);
            switch (userInput) {

                case EXIT:
                    System.out.println("Bye Bye");
                    exit = true;
                    return exit;

                case NEW_GAME:
                    exit = false;
                    display.displayActualScores(userScore, computerScore);
                    userScore = 0;
                    computerScore = 0;
                    break;

                default:
                    userShape = Shapes.valueOf(userInput.toUpperCase());
                    computerShape = shapeGenerator.randomShapeGenerator();

                    display.showRoundResult(userShape, computerShape);
                    if (!userShape.equals(computerShape)) {
                        if (userShape.equals(Shapes.ROCK) && computerShape.equals(Shapes.SCISSORS) ||
                                userShape.equals(Shapes.SCISSORS) && computerShape.equals(Shapes.PAPER) ||
                                userShape.equals(Shapes.PAPER) && computerShape.equals(Shapes.ROCK)) {
                            userScore++;
                            display.userWinsMessage(playerName, userScore, computerScore);
                        } else {
                            computerScore++;
                            display.computerWinsMessage(playerName, userScore, computerScore);
                        }
                    } else {
                        display.drawMessage(playerName, userScore, computerScore);
                    }
            }
            if (roundsPerGame == userScore || roundsPerGame == computerScore) {
                end = true;
            }
        }
        display.displayScores(userScore, computerScore);
        userInput = validateGameControllers.validateEndOfGameChoice(scanner.nextLine(), scanner, display);

        if (userInput.equals(NEW_GAME)) {
            exit = false;
        }

        if (userInput.equals(EXIT)) {
            System.out.println("Bye Bye");
            exit = true;
        }
        return exit;
    }
}