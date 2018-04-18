package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class HomeworkTestSuite {
    @Test
    public void testUpdate() {
        //G
        Mentor waldemar = new Mentor("Waldemar");
        Mentor miroslaw = new Mentor("Mirosław");
        Student john = new Student("John Snow");
        Student alex = new Student("Alex Ferguson");
        Student clay = new Student("Clay Thompson");
        john.registerObserver(waldemar);
        alex.registerObserver(miroslaw);
        clay.registerObserver(miroslaw);
        //W
        john.addHomework("While Loop");
        john.addHomework("For Loop");
        john.addHomework("JUnit");
        alex.addHomework("For Loop");
        alex.addHomework("JUnit");
        clay.addHomework("While Loop");
        //T
        assertEquals(3, waldemar.getUpdateCount());
        assertEquals(3, miroslaw.getUpdateCount());

    }
}