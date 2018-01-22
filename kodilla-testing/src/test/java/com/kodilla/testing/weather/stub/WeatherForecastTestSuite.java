package com.kodilla.testing.weather.stub;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeatherForecastTestSuite {

    @Test
    public void testCalculateForecastWithStub() {
        //given
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);
        //when
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        //then
        assertEquals(5, quantityOfSensors);
    }
}
