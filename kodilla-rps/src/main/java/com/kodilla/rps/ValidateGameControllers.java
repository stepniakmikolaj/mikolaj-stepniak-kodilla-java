package com.kodilla.rps;

import java.util.Scanner;

public class ValidateGameControllers {
    private static final String EXIT = "x";
    private static final String NEW_GAME = "n";
    private static final String YES = "Y";
    private static final String CHOICE_1 = "1";
    private static final String CHOICE_2 = "2";
    private static final String CHOICE_3 = "3";


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

    public String validateGameInput(String input, Scanner scanner, Messages messages) {
        while (true) {
            switch (input) {
                case CHOICE_1:
                    return Shapes.ROCK.name();
                case CHOICE_2:
                    return Shapes.PAPER.name();
                case CHOICE_3:
                    return Shapes.SCISSORS.name();
                case EXIT:
                    messages.quitConfirmationMessage();
                    input = scanner.nextLine();
                    if (input.toUpperCase().equals(YES)) { return EXIT; }
                    break;
                case NEW_GAME:
                    messages.newGameConfirmationMessage();
                    input = scanner.nextLine();
                    if (input.toUpperCase().equals(YES)) { return NEW_GAME; }
                    break;
                default:
                    messages.incorrectGameInput();
                    input = scanner.nextLine();
            }
        }
    }

    public String validateEndOfGameChoice(String input, Scanner scanner, Messages messages) {
        while (true) {
            switch (input) {
                case EXIT:
                    messages.quitConfirmationMessage();
                    input = scanner.nextLine();
                    if (input.toUpperCase().equals(YES)) {
                        return EXIT;
                    }
                    break;
                case NEW_GAME:
                    messages.newGameConfirmationMessage();
                    input = scanner.nextLine();
                    if (input.toUpperCase().equals(YES)) {
                        return NEW_GAME;
                    }
                    break;
                default:
                    messages.incorrectEndOfGameInput();
                    input = scanner.nextLine();
            }
        }
    }
}