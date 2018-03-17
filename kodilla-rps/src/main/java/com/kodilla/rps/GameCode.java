package com.kodilla.rps;

import java.util.Scanner;

public class GameCode {
    private static final String EXIT = "x";
    private static final String NEW_GAME = "n";
    private int userScore = 0;
    private int computerScore = 0;

    public boolean run(Messages messages, Scanner scanner, String playerName) {
        userScore = 0;
        computerScore = 0;
        int roundsPerGame = messages.askForNumberOfRounds(playerName);

        ValidateGameControllers validateGameControllers = new ValidateGameControllers();

        messages.mainMenu();

        int roundCount = 0;
        boolean end = false;
        boolean exit = false;
        String userInput;
        Shapes userShape, computerShape = null;
        ShapeGenerator shapeGenerator = new ShapeGenerator();
        while (!end) {
            roundCount++;
            userInput = validateGameControllers.validateGameInput(scanner.nextLine(), scanner, messages);
            switch (userInput) {

                case EXIT:
                    exit = true;
                    roundCount = roundsPerGame;
                    break;

                case NEW_GAME:
                    roundCount = roundsPerGame;
                    break;

                default:
                    userShape = Shapes.valueOf(userInput.toUpperCase());
                    try {
                        computerShape = shapeGenerator.randomShapeGenerator();
                    } catch (InvalidChoiceTypeException e) {
                        e.printStackTrace();
                        System.out.println("Invalid choice generated.");
                    }
                    messages.showRoundResult(userShape, computerShape);
                    if (!userShape.equals(computerShape)) {
                        if (userShape.equals(Shapes.ROCK) && computerShape.equals(Shapes.SCISSORS) || userShape.equals(Shapes.SCISSORS) && computerShape.equals(Shapes.PAPER) || userShape.equals(Shapes.PAPER) && computerShape.equals(Shapes.ROCK)) {
                            userScore++;
                            messages.userWinsMessage(playerName, userScore, computerScore);
                        } else {
                            computerScore++;
                            messages.computerWinsMessage(playerName, userScore, computerScore);
                        }
                    } else {
                        messages.drawMessage(playerName, userScore, computerScore);
                    }
            }
            if (roundsPerGame == userScore || roundsPerGame == computerScore) {
                end = true;
                break;
            }
        }
        messages.displayScores(userScore, computerScore);
        userInput = validateGameControllers.validateEndOfGameChoice(scanner.nextLine(), scanner, messages);

        if (userInput.equals(EXIT)) {
            exit = true;
        }
        return exit;
    }
}