package com.kodilla.testing.weather.stub;

import java.util.HashMap;

public class TemperaturesStub implements Temperatures{

    @Override
    public HashMap<Integer, Double> getTemperatures() {

        HashMap<Integer, Double> stubResult = new HashMap<Integer, Double>();

        //dumy data
        stubResult.put(0, 24.5);
        stubResult.put(1, 32.9);
        stubResult.put(2, 13.7);
        stubResult.put(3, 27.1);
        stubResult.put(4, 1.9);

        return stubResult;
    }
}
