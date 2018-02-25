package com.kodilla.rps;

import com.kodilla.rps.player.Computer;
import com.kodilla.rps.player.Player;
import com.kodilla.rps.player.User;

import java.util.*;

public class Playground {

    private final Computer computer;
    public static User user;
    public static Scanner scanner;
    private static int rounds; //TODO: getter / increase
    private boolean end;
    private boolean gameContinued;

    public Playground() {
        this.rounds = 0;
        this.user = new User("User");
        this.computer = new Computer("CPU");
        this.scanner = new Scanner(System.in);
        this.end = false;
    }

    public static int getRounds() {
        return rounds;
    }

    public static void setRounds(int rounds) {
        Playground.rounds = rounds;
    }

    public void game() {
            PromptClass.promptUserForUsername();
            PromptClass.promptUserForNumberOfRoundsToPlayToWin(1, 99);
            ShowClass.showGameControls();
        this.end = false;
        while (!end) {
            ChoiceType userChoice = user.play();

            if (userChoice == ChoiceType.DEFAULT) {
                this.end = true;
                break;
            }

            ChoiceType computerChoice = this.computer.play();
            if (!CheckClass.checkIfDraw(userChoice, computerChoice)) {
                this.playScenario(userChoice, this.computer, computerChoice);
            }

            CheckClass.checkPlayersScores(this.user, this.computer, userChoice, computerChoice);
            if (CheckClass.checkIfSomeoneWon(this.user, this.computer)) {
                ShowClass.showWinner(this.user, this.computer);
                if (!UserAction.doesUserWantToPlayNextGame()) {
                    end = true;
                }
                break;
            }
        }

//        prompt
//        playTurn();
//        while(rounds < toPlayRounds))
//            playTurn();
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
            user.increaseWins();
        }

        else if (computerChoice == ChoiceType.ROCK) {
            //System.out.println(computer.getUsername() + " scores a point!");
            computer.increaseWins();
        }
    }

    public void userPlayedPaper(Player computer, ChoiceType computerChoice) {
        if (computerChoice == ChoiceType.ROCK) {
            //System.out.println(getUsername() + " scores a point!");
            user.increaseWins();
        }

        else if (computerChoice == ChoiceType.SCISSORS) {
            //System.out.println(computer.getUsername() + " scores a point!");
            computer.increaseWins();
        }
    }

    public void userPlayedRock(Player computer, ChoiceType computerChoice) {
        if (computerChoice == ChoiceType.SCISSORS) {
            //System.out.println(getUsername() + " scores a point!");
            user.increaseWins();
        }

        else if (computerChoice == ChoiceType.PAPER) {
            //System.out.println(computer.getUsername() + " scores a point!");
            computer.increaseWins();
        }
    }

    public boolean isEnd() {
        return this.end;
    }
}
