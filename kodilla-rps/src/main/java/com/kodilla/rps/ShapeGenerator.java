package com.kodilla.rps;

import java.util.Random;

public class ShapeGenerator {

    public Shapes randomShapeGenerator() {
        int random = new Random().nextInt(3) + 1;
        return Shapes.getChoiceByValue(String.valueOf(random));
    }
}