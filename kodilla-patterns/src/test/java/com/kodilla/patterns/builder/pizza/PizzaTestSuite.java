package com.kodilla.patterns.builder.pizza;

import org.junit.Test;

import static org.junit.Assert.*;

public class PizzaTestSuite {
    @Test
    public void testPizzaNew(){
        //G
        Pizza pizza = new Pizza.PizzaBuilder()
                .ingredient("Onion")
                .bottom("Thin")
                .ingredient("Ham")
                .sauce("Spicy")
                .ingredient("Mushrooms")
                .build();
        System.out.println(pizza);
        //W
        int howManyIngredients = pizza.getIngredients().size();
        //T
        assertEquals(3, howManyIngredients);
    }
}