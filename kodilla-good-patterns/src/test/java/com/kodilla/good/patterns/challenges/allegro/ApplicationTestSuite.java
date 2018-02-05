package com.kodilla.good.patterns.challenges.allegro;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ApplicationTestSuite {

    public List<Product> allegro = new ArrayList<>();

    @Test
    public void testAddProduct(){
        //Given
        Product product1 = new Product("Klapki", 19.99);
        Product product2 = new Product("Czapka", 5.99);
        //When
        allegro.add(product1);
        allegro.add(product2);
        //Then
        assertEquals(2, allegro.size());
    }

    @Test
    public void testRemoveProduct(){
        //Given
        Product product1 = new Product("Okulary", 19.99);
        Product product2 = new Product("Czepek", 5.99);
        //When
        allegro.add(product1);
        allegro.add(product2);
        allegro.remove(product1);
        //Then
        assertEquals(1, allegro.size());
    }
}