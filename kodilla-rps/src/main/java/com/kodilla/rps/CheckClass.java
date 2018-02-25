package com.kodilla.rps;

import com.kodilla.rps.player.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckClass {
    public static final List<String> ALLOWED_NUMBER_CHOICES = Arrays.asList("1", "2", "3");
    private static final List<String> ALLOWED_CHARS = Arrays.asList("x", "n");

    public static boolean checkIfSomeoneWon(Player user, Player computer) {
        return user.getWins() >= Playground.getRounds() || computer.getWins() >= Playground.getRounds();
    }

    public static void checkPlayersScores(Player user, Player computer, ChoiceType userChoice, ChoiceType computerChoise) {
        System.out.println(user.getUsername() + " - " + userChoice + " VS " + computerChoise + " - " + computer.getUsername());
        System.out.println(user.getUsername() + " - " + user.getWins() + "\n" + computer.getUsername() + " - " + computer.getWins());
        //System.out.print("\"Rock - 1\", \"Paper - 2\" or \"Scissors - 3\" \n");
    }

    public static boolean checkIfDraw(ChoiceType userChoice, ChoiceType computerChoice) {
        if (userChoice == computerChoice) {
            //System.out.println(userChoice + " vs " + computerChoice + " Tie!");
            return true;
        }
        return false;
    }

    public static boolean checkIfUserPassedNotAllowedChar(String userChoiceValue) {
        List<String> allValues = new ArrayList<>(ALLOWED_CHARS);
        allValues.addAll(ALLOWED_NUMBER_CHOICES);
        if (userChoiceValue == null || !allValues.contains(userChoiceValue)) {
            ShowClass.showGameControls();
            return true;
        }
        return false;
    }
}
