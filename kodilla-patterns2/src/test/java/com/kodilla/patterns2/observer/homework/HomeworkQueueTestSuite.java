package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class HomeworkQueueTestSuite {
    @Test
    public void testUpdate() {
        //G
        HomeworkQueue magda = new HomeworkQueue("Magda");
        HomeworkQueue kasia = new HomeworkQueue("Kasia");
        HomeworkQueue ilona = new HomeworkQueue("Ilona");
        HomeworkQueue basia = new HomeworkQueue("Basia");
        HomeworkQueue tosia = new HomeworkQueue("Tosia");

        Mentor waldemar = new Mentor("Waldemar");
        Mentor miroslaw = new Mentor("Mirosław");

        magda.registerObserver(waldemar);
        kasia.registerObserver(waldemar);
        ilona.registerObserver(miroslaw);
        basia.registerObserver(miroslaw);
        tosia.registerObserver(miroslaw);

        //W
        //mentor1
        magda.addHomework("Wzorzec Fasada");
        magda.addHomework("Programowanie aspektowe w Spring Boot");
        kasia.addHomework("Wzorzec Dekorator");
        kasia.addHomework("Wzorzec Obserwator");
        kasia.addHomework("Wzorzec Adapter");
        //mentor2
        ilona.addHomework("Wzorzec Dekorator");
        ilona.addHomework("Wzorzec Obserwator");
        basia.addHomework("Wzorzec Dekorator");
        basia.addHomework("Programowanie aspektowe w Spring Boot");
        basia.addHomework("Wzorzec Obserwator");
        tosia.addHomework("Wzorzec Adapter");

        //T
        assertEquals(5, waldemar.getUpdateCount());
        assertEquals(6, miroslaw.getUpdateCount());
    }
}