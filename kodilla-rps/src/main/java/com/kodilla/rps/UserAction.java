package com.kodilla.rps;

import java.util.Scanner;

public class UserAction {
    private static Scanner scanner = new Scanner(System.in);
    private static Boolean yesOrNo;

    public static boolean doesUserWantToPlayNextGame() {
        System.out.println("Do You want play again? \"Yes = y\" or \"No = n\"");

        yesOrNo = PromptClass.promptYesOrNo("n", "y");
        if (yesOrNo != null) return yesOrNo;

        return true;
    }

    public static boolean doesUserWantToExit() {
        System.out.println("Exit Game? \"Yes = y\" or \"No = n\"");

        yesOrNo = PromptClass.promptYesOrNo("n", "y");
        if (yesOrNo != null) return yesOrNo;

        return false;
    }

    public static boolean doesUserWantToStartANewGame() {
        System.out.println("Are You really want to end this Game? \"Yes = y\" or \"No = n\"");

        String choice = scanner.next();
        if (choice.equalsIgnoreCase("y")) {
            return true;
        }
        return false;
    }
}
