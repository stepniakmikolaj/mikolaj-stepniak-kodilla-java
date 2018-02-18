package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public final Task makeTask(final TaskType taskType) {
        switch (taskType) {
            case SHOPPING_TASK:
                return new ShoppingTask("Shopping", "Pizza", 100);
            case PAINTING_TASK:
                return new PaintingTask("Painting", "Yellow", "Submarine");
            case DRIVING_TASK:
                return new DrivingTask("Driving", "Mars", "Bicycle");
            default:
                throw new IllegalArgumentException("Task not found");
        }
    }
}
