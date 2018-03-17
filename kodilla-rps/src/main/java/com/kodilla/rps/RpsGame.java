package com.kodilla.rps;

import java.util.Scanner;

public class RpsGame {

    public static void main(String[] args) {

        Messages messages = new Messages();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        messages.welcomeMessage();
        String playerName = scanner.nextLine();
        while (!exit) {
            GameCode gameCode = new GameCode();
            exit = gameCode.run(messages, scanner, playerName);
        }
    }
}