package com.kodilla.patterns.strategy.social;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //G
        User mikolaj = new ZGeneration("Mikołaj");
        User barbara = new YGeneration("Barbara");
        User jolanta = new Millenials("Jolanta");

        //W
        String mikolajShouldShare = mikolaj.sharePost();
        System.out.println(mikolaj.getUsername() + " " + mikolajShouldShare);
        String barbaraShouldShare = barbara.sharePost();
        System.out.println(barbara.getUsername() + " " + barbaraShouldShare);
        String jolantaShouldShare = jolanta.sharePost();
        System.out.println(jolanta.getUsername() + " " + jolantaShouldShare);

        //T
        assertEquals("Facebook", mikolajShouldShare);
        assertEquals("Twitter", barbaraShouldShare);
        assertEquals("Snapchat", jolantaShouldShare);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //G
        User mikolaj = new ZGeneration("Mikołaj");

        //W
        String mikolajShouldShare = mikolaj.sharePost();
        System.out.println(mikolaj.getUsername() + " " + mikolajShouldShare);
        mikolaj.setSocialPublisher(new SnapchatPublisher());
        mikolajShouldShare = mikolaj.sharePost();
        System.out.println(mikolaj.getUsername() + " " + mikolajShouldShare);

        //T
        assertEquals("Snapchat", mikolajShouldShare);
    }

}