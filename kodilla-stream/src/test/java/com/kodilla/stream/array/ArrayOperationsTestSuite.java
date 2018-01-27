package com.kodilla.stream.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int[] n = {1,2,3,4,5,6,7,8,9,10,9,8,7,6,5,4,3,2,1};
        //When
        double average = ArrayOperations.getAverage(n);
        double expected = 5.2;
        //Then
        assertEquals(expected, average,0.1);
    }
}
