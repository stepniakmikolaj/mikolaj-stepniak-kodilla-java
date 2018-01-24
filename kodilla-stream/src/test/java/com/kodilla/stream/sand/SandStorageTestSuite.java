package com.kodilla.stream.sand;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SandStorageTestSuite {
    @Test
    public void testGetSandBeansQuantity(){
        //Given
        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Europe());
        continents.add(new Asia());
        continents.add(new Africa());
        //When
        BigDecimal totalSand = BigDecimal.ZERO;
        for(SandStorage continent : continents){
            totalSand = totalSand.add(continent.getSandBeansQuantity());
        }
        //Then
        BigDecimal expectedSand = new BigDecimal("214613625891461362587");
        assertEquals(expectedSand, totalSand);
    }

    @Test
    public void testGetSandBeansQuantityWithReduce(){
        //Given
        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Europe());
        continents.add(new Asia());
        continents.add(new Africa());
        //When
        BigDecimal totalSand = continents.stream()
                .map(SandStorage::getSandBeansQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        //Then
        BigDecimal expectedSand = new BigDecimal("214613625891461362587");
        assertEquals(expectedSand, totalSand);
    }
}
