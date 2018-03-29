package com.kodilla.rps;

import java.util.Scanner;

public class RpsGame {

    /**
     * main method runs game.
     *
     * @param args the command line arguments.
     */
    public static void main(final String[] args) {

        Display display = new Display();
        Scanner scanner = new Scanner(System.in);//bug
        boolean exit = false;

        display.welcomeMessage();
        String playerName = scanner.nextLine();
        while (!exit) {
            GameCode gameCode = new GameCode();
            exit = gameCode.run(display, scanner, playerName);
        }
    }
}