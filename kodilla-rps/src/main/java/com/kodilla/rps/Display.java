package com.kodilla.rps;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Display {

    public void welcomeMessage() {
        System.out.println("\"RPS - GAME\"!\nEnter name: ");
    }

    /**
     * set game length.
     *
     * @param playerName playerName in game.
     * @return how many wins rounds player want to play.
     */
    public int askForNumberOfRounds(final String playerName) {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8.name());
        int rounds;
        System.out.print("Welcome " + playerName.toUpperCase() + " to how many won rounds you want to play?: \n".toUpperCase());
        while (!scanner.hasNextInt() || (rounds = scanner.nextInt()) < 1) {
            System.out.println("Incorrect number of rounds, please try again: ".toUpperCase());
        }
        return rounds;
    }

    public void mainMenu() {
        System.out.println("Controllers:\n'1' - \"rock\"" + "\n" + "'2' - \"paper\"" +
                "\n" + "'3' - \"scissors\"" + "\n" + "'x' - quit game; " + "\n" + "'n' - start new game;");
    }

    public void quitConfirmationMessage() {
        System.out.println("Quit game, are you sure? (Y/N)");
    }

    public void newGameConfirmationMessage() {
        System.out.println("Start new game, current results will be lost, are you sure? (Y/N)");
    }

    public void incorrectGameInput() {
        System.out.println("'1', '2', '3', 'n' or 'x' ...please try again: ");
    }

    public void userWinsMessage(final String playerName, final int userScore, final int computerScore) {
        System.out.println(String.format("%s wins! %s: %d, Computer: %d", playerName.toUpperCase(), playerName.toUpperCase(), userScore, computerScore));
    }

    public void computerWinsMessage(final String playerName, final int userScore, final int computerScore) {
        System.out.println(String.format("Computer wins! %s: %d, Computer: %d", playerName.toUpperCase(), userScore, computerScore));
    }

    public void drawMessage(final String playerName, final int userScore, final int computerScore) {
        System.out.println(String.format("Draw, %s: %d, Computer: %d", playerName.toUpperCase(), userScore, computerScore));
    }

    /**
     * display all scores.
     *
     * @param userScore     display user score.
     * @param computerScore display computer score.
     */
    public void displayScores(final int userScore, final int computerScore) {
        if (userScore > computerScore) {
            System.out.println(String.format("-------------------------------------------------" +
                    "%nCongratulations You Won!" +
                    "%n%d vs %d" +
                    "%n-------------------------------------------------", userScore, computerScore));
        } else {
            System.out.println(String.format("-------------------------------------------------" +
                    "%nYou Lose!" +
                    "%n%d vs %d" +
                    "%n-------------------------------------------------", userScore, computerScore));
        }
        System.out.println("\nWould you like try one more time? 'n' - start new game; 'x' - quit;");
    }

    public void showRoundResult(final Shapes userShape, final Shapes computerShape) {
        System.out.println(String.format("you: %s vs %s :computer", userShape, computerShape));
    }

    public void incorrectEndOfGameInput() {
        System.out.println("'n' or 'x' ...please try again: ");
    }
}