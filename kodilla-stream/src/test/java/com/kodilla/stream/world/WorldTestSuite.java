package com.kodilla.stream.world;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        Continent europe = new Continent("Europe", Arrays.asList(
                new Country("C1", new BigDecimal("9874563210")),
                new Country("C2", new BigDecimal("1234567890")),
                new Country("C3", new BigDecimal("9638520741")),
                new Country("C4", new BigDecimal("7410852963"))));

        Continent asia = new Continent("Asia", Arrays.asList(
                new Country("C1", new BigDecimal("7894561230")),
                new Country("C2", new BigDecimal("6547890123")),
                new Country("C3", new BigDecimal("3217896540")),
                new Country("C4", new BigDecimal("3578964120"))));

        Continent africa = new Continent("Africa", Arrays.asList(
                new Country("C1", new BigDecimal("1596328740")),
                new Country("C2", new BigDecimal("7538694210")),
                new Country("C3", new BigDecimal("7481590263")),
                new Country("C4", new BigDecimal("3062951847"))));

        World earth = new World(Arrays.asList(europe, asia, africa));

        //When
        BigDecimal allOfThePeople = earth.getPeopleQuantity();

        //Then
        BigDecimal expectedValue = new BigDecimal("69077381877");
        assertEquals(expectedValue, allOfThePeople);
    }
}