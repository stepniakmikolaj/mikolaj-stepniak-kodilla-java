package com.kodilla.rps;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class RpsGame {

    /**
     * main method runs game.
     *
     * @param args the command line arguments.
     */
    public static void main(final String[] args) {

        Display display = new Display();
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8.name());
        boolean exit = false;

        display.welcomeMessage();
        String playerName = scanner.nextLine();
        while (!exit) {
            GameCode gameCode = new GameCode();
            exit = gameCode.run(display, scanner, playerName);
        }
    }
}