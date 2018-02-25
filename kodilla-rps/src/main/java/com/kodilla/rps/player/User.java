package com.kodilla.rps.player;

import com.kodilla.rps.CheckClass;
import com.kodilla.rps.ChoiceType;
import com.kodilla.rps.ShowClass;
import com.kodilla.rps.UserAction;
import com.kodilla.rps.exception.InvalidChoiceTypeException;

import java.util.Scanner;

public class User extends Player {

    private final Scanner scanner;

    public User(String username) {
        super(username);
        this.scanner = new Scanner(System.in);
    }

    @Override
    public ChoiceType play() {
        String userChoiceValue = "";

        while (true) {
            System.out.println("value");
            userChoiceValue = this.scanner.next();

            if (CheckClass.checkIfUserPassedNotAllowedChar(userChoiceValue)) break;
            //
            if (userChoiceValue.equalsIgnoreCase("x")) {
                if (UserAction.doesUserWantToExit()) {
                    System.out.println("exit");
                    break;
                }
                else continue;
            }
            else if (userChoiceValue.equalsIgnoreCase("n")) {
                if (UserAction.doesUserWantToStartANewGame()) {
                    // implement starting a new game
                    System.out.println("start new game");
                    break;
                }
                else continue;
            }
        }


        try {
            if (CheckClass.ALLOWED_NUMBER_CHOICES.contains(userChoiceValue)) {
                return ChoiceType.getChoiceByValue(userChoiceValue);
            }
        } catch (InvalidChoiceTypeException e) {
            e.printStackTrace();
        }

        return ChoiceType.DEFAULT;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
