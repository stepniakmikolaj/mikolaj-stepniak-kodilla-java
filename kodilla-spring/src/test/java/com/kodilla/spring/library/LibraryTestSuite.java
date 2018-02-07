package com.kodilla.spring.library;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class LibraryTestSuite {

    @Test
    public void saveToDb() {
        //G
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library library = context.getBean(Library.class);
        //W
        library.saveToDb();
        //T
        //do nothing
    }

    @Test
    public void loadFromDb() {
        //G
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library library = context.getBean(Library.class);
        //W
        library.loadFromDb();
        //T
        //do nothing
    }

    @Test
    public void testContextLibrary(){
        //G
        ApplicationContext context = new AnnotationConfigApplicationContext(LibraryConfing.class);
        //W&T
        System.out.println("===== Beans Library list ==== >>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<< ===== Beans list ====");
    }

    @Test
    public void testContextAll(){
        //G
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        //W&T
        System.out.println("===== Beans All list ==== >>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<< ===== Beans list ====");
    }
}