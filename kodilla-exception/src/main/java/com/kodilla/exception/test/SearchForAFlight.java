package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchForAFlight {

    Map<String, Boolean> airports = new HashMap<>();

    {
        airports.put("A1", false);
        airports.put("A2", true);
        airports.put("B1", true);
        airports.put("B2", false);
        airports.put("C1", true);
        airports.put("C2", true);
    }


    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        if (airports.containsKey(flight.getArrivalAirport())) {
            boolean isAirportExist = airports.get(flight.getArrivalAirport());
            System.out.println("Is the airport " + flight.getArrivalAirport() + " available: " + isAirportExist);
            return isAirportExist;
        } else {
            throw new RouteNotFoundException(flight.getArrivalAirport() + " Airport doesn't exist");
        }
    }

    public static void main(String[] args) {

        Flight flight = new Flight("D5", "A1");
        SearchForAFlight searchForAFlight = new SearchForAFlight();

        try {
            searchForAFlight.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }
    }
}

