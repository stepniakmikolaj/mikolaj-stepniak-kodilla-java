package com.kodilla.rps.player;

import com.kodilla.rps.ChoiceType;
import com.kodilla.rps.exception.InvalidChoiceTypeException;

import java.util.Random;

public class Computer extends Player {
    public ChoiceType playRandom() {
        try {
            return ChoiceType.getChoiceByValue(String.valueOf(new Random().nextInt(3) + 1));
        } catch (InvalidChoiceTypeException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}
