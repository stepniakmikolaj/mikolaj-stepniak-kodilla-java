package com.kodilla.spring.reader;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class ReaderConfingTestSuite {

    @Test
    public void testReader() {
        //G
        ApplicationContext context = new AnnotationConfigApplicationContext(ReaderConfing.class);
        Reader reader = context.getBean(Reader.class);
        //W&T
        reader.read();
    }

    @Test
    public void testConditional() {
        //G
        ApplicationContext context = new AnnotationConfigApplicationContext(ReaderConfing.class);
        //W
        boolean book2Exists = context.containsBean("book2");
        //Then
        System.out.println("Bean book2 was found in the container: " + book2Exists);
    }

}