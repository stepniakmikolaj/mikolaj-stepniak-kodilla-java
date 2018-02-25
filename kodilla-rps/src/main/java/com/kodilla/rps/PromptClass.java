package com.kodilla.rps;

public class PromptClass {

    public static Boolean promptYesOrNo(String stringValueOfTrue, String stringValueOfFalse) {
        String choice = Playground.scanner.next();
        if (choice.equalsIgnoreCase(stringValueOfTrue)) {
            return false;
        }
        if (choice.equalsIgnoreCase(stringValueOfFalse)) {
            System.out.println("Goodbye!");
            return true;
        }
        return null;
    }

    public static void promptUserForUsername() {
        System.out.println("rps game!!!".toUpperCase());
        System.out.println("Please enter Your name: ".toUpperCase());
        Playground.user.setUsername(Playground.scanner.next().toUpperCase());
    }

    public static int promptUserForNumberOfRoundsToPlayToWin(int min, int max) {
        System.out.print("Welcome " + Playground.user.getUsername() + " to how many won rounds you want to play?: \n".toUpperCase());
        int number;
        do {
            System.out.println("Range: ".toUpperCase() + min + "-" + max);
            while (!Playground.scanner.hasNextInt()) {
                System.out.println("Please, enter number. Range: ".toUpperCase() + min + "-" + max);
                Playground.scanner.next();
            }
            number = Playground.scanner.nextInt();
        } while (number < min || number > max);
        Playground.setRounds(number);
        return number;
    }
}
