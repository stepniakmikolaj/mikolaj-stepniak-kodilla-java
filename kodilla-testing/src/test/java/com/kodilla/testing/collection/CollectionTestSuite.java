package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;

import org.junit.*;

import java.util.ArrayList;

/*
W katalogu src/test/java, utwórz pakiet com.kodilla.testing.collection
W utworzonym pakiecie stwórz klasę testową (zbiór testów) CollectionTestSuite,
a w niej napisz testy sprawdzające czy metoda filtrująca liczby nieparzyste działa poprawnie:
testOddNumbersExterminatorEmptyList (sprawdzi czy klasa zachowuje się poprawnie gdy lista jest pusta)
testOddNumbersExterminatorNormalList (sprawdzi czy klasa zachowuje się poprawnie gdy lista zawiera liczby parzyste i nieparzyste)
Użyj również adnotacji @Before oraz @After, aby wyświetlić informację o tym, jakie operacje (testy) są aktualnie wykonywane.
*/

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
        System.out.println("Test Suite: Rozpoczynam");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: Kończę");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing: " + result.size());
        //Then
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(numbers);
        System.out.println("Testing: " + result.size());
        // Then
        Assert.assertEquals(0, result.size());
    }

}
