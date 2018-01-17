package com.kodilla.testing.collection;

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
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        int result = oddNumbersExterminator.emptyList(numbers.size());
        System.out.println("Testing: " + result);
        //Then
        Assert.assertEquals(0, result);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        int result = oddNumbersExterminator.normalList(numbers.size());
        System.out.println("Testing: " + result);
        //Then
        Assert.assertEquals(8, result);
    }

    @Test
    public void testOddNumberExterminatorOddList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        int result = oddNumbersExterminator.oddNumbers(oddNumbers.size());
        System.out.println("Testing: " + result);
        //Then
        Assert.assertEquals(4, result);
    }

    @Test
    public void testOddNumbersExterminatorEvenList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        int result = oddNumbersExterminator.evenNumbers(oddNumbers.size());
        System.out.println("Testing: " + result);
        //Then
        Assert.assertEquals(4, result);
    }
}
