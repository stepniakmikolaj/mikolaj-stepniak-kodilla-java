package com.kodilla.mod1;

public class App3 {
    public static void main(String args[]){
        Knight knight1 = new Knight(new DeadIslandQ());
        Knight knight2 = new Knight(new EliteKnightQ());

        knight1.doQuest();
        knight2.doQuest();
    }
}
