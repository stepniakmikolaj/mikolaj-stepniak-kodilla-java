package com.kodilla.patterns.builder.bigmac;

import org.junit.Test;

import static org.junit.Assert.*;

public class BigMacTestSuite {
    @Test
    public void testBigMacNew(){
        //G
        BigMac bigMac = new BigMac.BigMacBuilder()
                .roll(Roll.SESAME)
                .sauce(Sauce.THOUSAND_ISLAND)
                .burgers(2)
                .ingedient(Ingredients.ONION)
                .ingedient(Ingredients.BACON)
                .ingedient(Ingredients.CHILLI_PEPPER)
                .ingedient(Ingredients.PICKLES)
                .ingedient(Ingredients.CHEESE)
                .ingedient(Ingredients.SALAD)
                .build();
        System.out.println(bigMac);

        //W

        //T
        assertEquals(Roll.SESAME, bigMac.getRoll());
        assertEquals(Sauce.THOUSAND_ISLAND, bigMac.getSauce());
        assertEquals(2, bigMac.getBurgers());
        assertEquals(6, bigMac.getIngredients().size());

    }

}