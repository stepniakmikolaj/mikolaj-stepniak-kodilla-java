package com.kodilla.rps.player;

import com.kodilla.rps.ChoiceType;
import com.kodilla.rps.exception.InvalidChoiceTypeException;

public abstract class Player {
    protected String username;
    private int wins = 0;

    public Player(String username) {
        this.username = username;
    }

    abstract public ChoiceType play();

    public void increaseWins() {
        this.wins++;
    }

    public String getUsername() {
        return username;
    }

    public int getWins() {
        return wins;
    }

//    public ChoiceType play(String value) {
//        try {
//            return ChoiceType.getChoiceByValue(value);
//        } catch (InvalidChoiceTypeException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//            return null;
//        }
//    }

    public void resetWins() {
        this.wins = 0;
    }
}
