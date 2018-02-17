package com.kodilla.patterns.factory.tasts;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShopping() {
        //G
        TaskFactory factory = new TaskFactory();
        //W
        Task shopping = factory.makeTask(TaskFactory.SHOPPING_TASK);
        //T
        assertEquals("Shopping", shopping.getTaskName());
        assertEquals("Buying: Pizza quantity: 100.0", shopping.executeTask());
        assertEquals(false, shopping.isTaskExecuted());
    }

    @Test
    public void testFactoryPainting(){
        //G
        TaskFactory factory = new TaskFactory();
        //W
        Task painting = factory.makeTask(TaskFactory.PAINTING_TASK);
        //T
        assertEquals("Painting", painting.getTaskName());
        assertEquals("I'm painting: Submarine color: Yellow", painting.executeTask());
        assertEquals(true, painting.isTaskExecuted());
    }

    @Test
    public void testFactoryDriving(){
        //G
        TaskFactory factory = new TaskFactory();
        //W
        Task driving = factory.makeTask(TaskFactory.DRIVING_TASK);
        //T
        assertEquals("Driving", driving.getTaskName());
        assertEquals("I'm driving to: Mars by: Bicycle", driving.executeTask());
        assertEquals(true, driving.isTaskExecuted());
    }


}