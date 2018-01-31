package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchForAFlight {
    public static void main(String[] args){

        Flight flight = new Flight("C2", "A1");
        SearchForAFlight searchForAFlight = new SearchForAFlight();

        try {
            searchForAFlight.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }
    }

        public void findFlight(Flight flight) throws RouteNotFoundException{
            Map<String, Boolean> airports = new HashMap<>();

            airports.put("A1", true);
            airports.put("A2", true);
            airports.put("B1", true);
            airports.put("B2", true);
            airports.put("C1", true);
            airports.put("C2", true);

            if (airports.containsKey(flight.getArrivalAirport()) && airports.containsKey(flight.getDepartureAirport())) {
                System.out.println("Flight from: " + flight.getDepartureAirport() + " to: " + flight.getArrivalAirport() + " found.");
            } else {
                throw new RouteNotFoundException("Airport doesn't exist");
            }
        }
}

