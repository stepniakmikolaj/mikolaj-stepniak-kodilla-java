package com.kodilla.rps;

public enum GameConfiguration {
    INSTANCE;

    private int rounds;

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
}
