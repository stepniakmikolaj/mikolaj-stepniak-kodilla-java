package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderCost() {
        //G
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //W
        BigDecimal theCost = pizzaOrder.getCost();
        //T
        assertEquals(new BigDecimal(15), theCost);
    }

    @Test
    public void testBasicPizzaOrderDescription() {
        //G
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //W
        String description = pizzaOrder.getDescription();
        //T
        assertEquals("Pizza dough, tomato sauce, mozzarella\n", description);
    }

    @Test
    public void testMikiOrderPizzaCost() {
        //G
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        pizzaOrder = new OnionDecorator(pizzaOrder);
        pizzaOrder = new ExtraMozzarellaDecorator(pizzaOrder);
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new SalamiDecorator(pizzaOrder);
        //W
        BigDecimal theCost = pizzaOrder.getCost();
        //T
        assertEquals(new BigDecimal(36), theCost);
    }

    @Test
    public void testMikiOrderPizzaDescription() {
        //G
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        pizzaOrder = new OnionDecorator(pizzaOrder);
        pizzaOrder = new ExtraMozzarellaDecorator(pizzaOrder);
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new SalamiDecorator(pizzaOrder);
        //W
        String description = pizzaOrder.getDescription();
        //T
        assertEquals("Pizza dough, tomato sauce, mozzarella\n" +
                " + mushrooms\n" +
                " + onion\n" +
                " + extra mozzaerlla\n" +
                " + ham\n" +
                " + salami\n", description);
    }
}