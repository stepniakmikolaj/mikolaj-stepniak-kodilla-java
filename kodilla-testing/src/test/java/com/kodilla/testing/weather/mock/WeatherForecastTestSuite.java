package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.Test;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WeatherForecastTestSuite {

    @Test
    public void testCalculateForecastWithMock() {
        //g
        Temperatures temperaturesMock = mock(Temperatures.class);
        HashMap<Integer, Double> temperaturesMap = new HashMap<Integer, Double>();
        temperaturesMap.put(0, 34.9);
        temperaturesMap.put(1, 23.9);
        temperaturesMap.put(2, 29.6);
        temperaturesMap.put(3, 27.8);
        temperaturesMap.put(4, 27.8);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //w
        int qantityOfSensors = weatherForecast.calculateForecast().size();
        //t
        assertEquals(5, qantityOfSensors);
    }
}
