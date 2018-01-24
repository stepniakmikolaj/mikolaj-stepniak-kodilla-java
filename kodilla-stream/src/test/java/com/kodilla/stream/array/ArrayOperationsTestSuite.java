package com.kodilla.stream.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int[] n = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        //When
        double average = ArrayOperations.getAverage(n);
        double expected = 10.5;
        //Then
        assertEquals(expected, average,0);
    }
}
