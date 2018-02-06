package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightPlan {
    private List<Flight> flights;

    public FlightPlan(){
        flights = new ArrayList<>();
        flights.add(new Flight("WAW", "KRK"));
        flights.add(new Flight("WAW", "GDA"));
        flights.add(new Flight("WAW", "WRO"));
        flights.add(new Flight("WRO", "KRK"));
        flights.add(new Flight("WRO", "WAW"));
        flights.add(new Flight("WRO", "GDA"));
        flights.add(new Flight("GDA", "KRK"));
        flights.add(new Flight("GDA", "WAW"));
        flights.add(new Flight("GDA", "WRO"));
        flights.add(new Flight("KRK", "GDA"));
        flights.add(new Flight("KRK", "WAW"));
        flights.add(new Flight("KRK", "WRO"));
    }

    public List<Flight> getFlights() {
        return flights;
    }
}
