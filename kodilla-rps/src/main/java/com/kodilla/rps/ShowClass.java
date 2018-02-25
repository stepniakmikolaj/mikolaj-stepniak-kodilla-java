package com.kodilla.rps;

import com.kodilla.rps.player.Player;

public class ShowClass {

    public static void showGameControls() {
        System.out.print("game controls:".toUpperCase());
        System.out.print("\nRock = 1\nPaper = 2\nScissors = 3\n".toUpperCase());
        System.out.print("exit game = x\nnew game = n\n".toUpperCase());
    }

    public static void showWinner(Player user, Player computer) {
        if (user.getWins() >= Playground.getRounds()) {
            System.out.println(user.getUsername() + " Wins " + user.getWins() + " - " + computer.getWins());
        } else if (computer.getWins() >= Playground.getRounds()) {
            System.out.println(computer.getUsername() + " Wins " + computer.getWins() + " - " + user.getWins());
        }
        user.resetWins();
        computer.resetWins();
    }
}
