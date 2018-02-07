package com.kodilla.rps.player;

import com.kodilla.rps.ChoiceType;

public class User extends Player {
    public void setUsername(String username) {
        this.username = username;
    }

    public void playScenario(ChoiceType choiceTypeOfPlayer, Player computer, ChoiceType computerChoice) {
        switch (choiceTypeOfPlayer) {
            case ROCK:
                userPlayedRock(computer, computerChoice);
                break;
            case PAPER:
                userPlayedPaper(computer, computerChoice);
                break;
            case SCISSORS:
                userPlayedScissors(computer, computerChoice);
                break;
            default:
                System.out.println("Scenario not found.");
                break;
        }
    }

    public void userPlayedScissors(Player computer, ChoiceType computerChoice) {
        if (computerChoice == ChoiceType.PAPER) {
            //System.out.println(getUsername() + " scores a point!");
            increaseWins();
        }

        else if (computerChoice == ChoiceType.ROCK) {
            //System.out.println(computer.getUsername() + " scores a point!");
            computer.increaseWins();
        }
    }

    public void userPlayedPaper(Player computer, ChoiceType computerChoice) {
        if (computerChoice == ChoiceType.ROCK) {
            //System.out.println(getUsername() + " scores a point!");
            increaseWins();
        }

        else if (computerChoice == ChoiceType.SCISSORS) {
            //System.out.println(computer.getUsername() + " scores a point!");
            computer.increaseWins();
        }
    }

    public void userPlayedRock(Player computer, ChoiceType computerChoice) {
        if (computerChoice == ChoiceType.SCISSORS) {
            //System.out.println(getUsername() + " scores a point!");
            increaseWins();
        }

        else if (computerChoice == ChoiceType.PAPER) {
            //System.out.println(computer.getUsername() + " scores a point!");
            computer.increaseWins();
        }
    }
}
