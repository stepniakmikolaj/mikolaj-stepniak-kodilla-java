package com.kodilla.rps;

public class RpsRunner {

    public static void main(String[] args) {

        while (true) {
            Playground playground = new Playground();
            playground.game();

            if (playground.isEnd()) {
                break;
            }
        }
    }

}