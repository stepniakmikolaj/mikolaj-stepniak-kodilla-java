package com.kodilla.rps;

import java.util.Scanner;

public class ValidateGameControllers {
    private static final String EXIT = "x";
    private static final String NEW_GAME = "n";
    private static final String YES = "Y";
    private static final String CHOICE_1 = "1";
    private static final String CHOICE_2 = "2";
    private static final String CHOICE_3 = "3";

    /**
     * Validate allowed value of rounds.
     *
     * @param roundsNumber number of rounds input by player.
     * @return validated number of rounds.
     */
    public int validateNumber(String roundsNumber) {
        if (roundsNumber.isEmpty()) {
            return 0;
        }
        roundsNumber = roundsNumber.replaceAll(" ", "");
        char[] charNumber = roundsNumber.toCharArray();
        for (int i = 0; i < charNumber.length; i++) {
            if (!Character.isDigit(charNumber[i])) {
                return 0;
            }
        }
        return Integer.parseInt(roundsNumber);
    }

    /**
     * Validate player input values in game.
     *
     * @param input   processes values from player.
     * @param scanner get values from player.
     * @param display get all needed display methods.
     * @return user choice, exit or new game.
     */
    public String validateGameInput(String input, final Scanner scanner, final Display display) {
        while (true) {
            switch (input) {
                case CHOICE_1:
                    return Shapes.ROCK.name();
                case CHOICE_2:
                    return Shapes.PAPER.name();
                case CHOICE_3:
                    return Shapes.SCISSORS.name();
                case EXIT:
                    display.quitConfirmationMessage();
                    input = scanner.nextLine();
                    if (input.toUpperCase().equals(YES)) {
                        return EXIT;
                    }
                    break;
                case NEW_GAME:
                    display.newGameDuringGameConfirmationMessage();
                    input = scanner.nextLine();
                    if (input.toUpperCase().equals(YES)) {
                        return NEW_GAME;
                    }
                    break;
                default:
                    display.incorrectGameInput();
                    input = scanner.nextLine();
            }
        }
    }

    /**
     * Validate player want to end game.
     *
     * @param input   processes values from player.
     * @param scanner get values from player.
     * @param display get all needed display methods.
     * @return exit or new game.
     */
    public String validateEndOfGameChoice(String input, final Scanner scanner, final Display display) {
        while (true) {
            switch (input) {
                case EXIT:
                    display.quitConfirmationMessage();
                    input = scanner.nextLine();
                    if (input.toUpperCase().equals(YES)) {
                        return EXIT;
                    }
                    break;
                case NEW_GAME:
                    display.newGameAtEndGameConfirmationMessage();
                    input = scanner.nextLine();
                    if (input.toUpperCase().equals(YES)) {
                        return NEW_GAME;
                    }
                    break;
                default:
                    display.incorrectEndOfGameInput();
                    input = scanner.nextLine();
            }
        }
    }
}