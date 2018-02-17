package com.kodilla.patterns.factory.tasts;

public final class TaskFactory {
    public static final String SHOPPING_TASK = "Shopping Task";
    public static final String PAINTING_TASK = "Painting Task";
    public static final String DRIVING_TASK = "Driving Task";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING_TASK:
                return new ShoppingTask("Shopping", "Pizza", 100);
            case PAINTING_TASK:
                return new PaintingTask("Painting", "Yellow", "Submarine");
            case DRIVING_TASK:
                return new DrivingTask("Driving", "Mars", "Bicycle");
            default:
                return null;

        }
    }
}
