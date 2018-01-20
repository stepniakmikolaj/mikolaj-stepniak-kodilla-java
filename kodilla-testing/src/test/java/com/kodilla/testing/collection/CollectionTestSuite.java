package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;


public class CollectionTestSuite {
    @Before
    public void before() {

        System.out.println("Test Case Before: Begin");
    }

    @After
    public void after() {

        System.out.println("Test Case After: End");
    }

    @BeforeClass
    public static void beforeClass() {

        System.out.println("Test Suite: Starting");
    }

    @AfterClass
    public static void afterClass() {

        System.out.println("Test Suite: Ending");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> theList = new ArrayList<Integer>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(theList,0);
        System.out.println("Testing: EmptyList - " + result.size());
        //Then
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> theList = new ArrayList<Integer>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(theList,20);
        System.out.println("Testing: NormalList - " + result.size());
        // Then
        Assert.assertEquals(20, result.size());
    }

}
