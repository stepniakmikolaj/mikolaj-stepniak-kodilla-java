package com.kodilla.rps;

import com.kodilla.rps.player.Computer;
import com.kodilla.rps.player.Player;
import com.kodilla.rps.player.User;

import java.util.Scanner;

public class Playground {
    private final Computer computer;
    private final User user;
    private final Scanner scanner;
    private int rounds;
    private boolean end;

    public Playground() {
        this.rounds = 0;
        this.user = new User();
        this.computer = new Computer();
        this.scanner = new Scanner(System.in);
        this.end = false;
    }

    public void game() {
        this.promptUserForUsername();
        this.promptUserForNumberOfRoundsToPlayToWin(1,99);
        this.displayInfo();
        while (!end) {
            String userChoiceValue = this.scanner.next();

            if (userChoiceValue.equalsIgnoreCase("x")) {
                if (doesUserWantToExit()) {
                    end = true;
                    continue;
                }
            }

            if (userChoiceValue.equalsIgnoreCase("n")) {
                if (doesUserWantToStartANewGame()) {
                    // implement starting a new game
                    this.rounds = 0;
                    this.user.setUsername("Player");
                    continue;
                }
            }

            if (!(1 <= Integer.valueOf(userChoiceValue) && Integer.valueOf(userChoiceValue) <= 3)) {
                System.out.println("\"Rock - 1\", \"Paper - 2\" or \"Scissors - 3\"");
                continue;
            }

            ChoiceType choiceType = user.play(userChoiceValue);
            ChoiceType computerChoice = this.computer.playRandom();
            if (!this.checkIfDraw(choiceType, computerChoice)) {
                user.playScenario(choiceType, this.computer, computerChoice);
            }

            this.checkPlayersScores(this.user, this.computer, choiceType, computerChoice);
            if (this.checkIfSomeoneWon(this.user, this.computer)) {
                end = true;
            }
        }
        this.showWinner(this.user, this.computer);
        this.doesUserWantToExit();
    }

    public boolean isEnd() {
        return this.end;
    }

    private boolean doesUserWantToExit() {
        System.out.println("Exit Game? \"Yes = y\" or \"No = n\"");

        String choice = this.scanner.next();
        if (choice.equalsIgnoreCase("n")) {
            game();
        }
        if (choice.equalsIgnoreCase("y")) {
            System.out.println("Goodbye!");
            return false;
        }

        return true;
    }

    private boolean doesUserWantToStartANewGame() {
        System.out.println("Are You really want to end this Game? \"Yes = y\" or \"No = n\"");

        String choice = this.scanner.next();
        if (choice.equalsIgnoreCase("n")) {
            game();
        }
        if (choice.equalsIgnoreCase("y")){
            game();
            return true;
        }
        return false;
    }

    private void displayInfo() {
        System.out.print("game controls:".toUpperCase());
        System.out.print("\nRock = 1\nPaper = 2\nScissors = 3\n".toUpperCase());
        System.out.print("exit game = x\nnew game = n\n".toUpperCase());
    }

    private void promptUserForUsername() {
        System.out.println("rps game!!!".toUpperCase());
        System.out.println("Please enter Your name: ".toUpperCase());
        this.user.setUsername(this.scanner.next().toUpperCase());
    }

    private int promptUserForNumberOfRoundsToPlayToWin(int min, int max) {
        System.out.print("Welcome " + this.user.getUsername() + " to how many won rounds you want to play?: \n".toUpperCase());
        int number;
        do {
            System.out.println("Range: " + min + "-" + max);
            while (!scanner.hasNextInt()) {
                System.out.println("Please, enter number. Range: " + min + "-" + max);
                scanner.next();
            }
            number = scanner.nextInt();
        } while (number < min || number > max);
        this.rounds = number;
        return number;
    }

    private boolean checkIfDraw(ChoiceType userChoice, ChoiceType computerChoice) {
        if (userChoice == computerChoice) {
            //System.out.println(userChoice + " vs " + computerChoice + " Tie!");
            return true;
        }
        return false;
    }

    private void checkPlayersScores(Player user, Player computer, ChoiceType userChoice, ChoiceType computerChoise) {
        System.out.println(user.getUsername() + " - " + userChoice + " VS " + computerChoise + " - " + computer.getUsername());
        System.out.println(user.getUsername() + " - " + user.getWins() + "\n" + computer.getUsername() + " - " + computer.getWins());
        System.out.print("\"Rock - 1\", \"Paper - 2\" or \"Scissors - 3\" \n");
    }

    private boolean checkIfSomeoneWon(Player user, Player computer) {
        return user.getWins() >= this.rounds || computer.getWins() >= this.rounds;
    }

    private void showWinner(Player user, Player computer){
        if (user.getWins() >= this.rounds){
            System.out.println(user.getUsername() + " Wins " + user.getWins() + " - " + computer.getWins());
        } else if (computer.getWins() >= this.rounds) {
            System.out.println(computer.getUsername() + " Wins " + computer.getWins() + " - " + user.getWins());
        }
    }
}
