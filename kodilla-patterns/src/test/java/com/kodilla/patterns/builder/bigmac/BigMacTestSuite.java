package com.kodilla.patterns.builder.bigmac;

import org.junit.Test;

import static org.junit.Assert.*;

public class BigMacTestSuite {
    @Test
    public void testBigMacNew(){
        //G
        BigMac bigMac = new BigMac.BigMacBuilder()
                .roll("sesame")
                .sauce("standard")
                .burgers(2)
                .ingedient("onion")
                .ingedient("tomato")
                .ingedient("bacon")
                .ingedient("salad")
                .ingedient("cheese")
                .ingedient("pickles")
                .build();
        System.out.println(bigMac);

        //W

        //T
        assertEquals("sesame", bigMac.getRoll());
        assertEquals("standard", bigMac.getSauce());
        assertEquals(2, bigMac.getBurgers());
        assertEquals(6, bigMac.getIngredients().size());

    }

}