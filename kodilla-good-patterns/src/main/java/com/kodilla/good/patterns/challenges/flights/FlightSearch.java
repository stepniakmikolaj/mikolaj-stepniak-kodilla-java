package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSearch {
    private FlightPlan flightPlan = new FlightPlan();

    public List<Flight> searchDepartures(String departureAirport) {
        System.out.println("Searching flights from: " + departureAirport.toUpperCase());
        List<Flight> departures = flightPlan.getFlights().stream()
                .filter(f -> f.getDepartureAirport().equalsIgnoreCase(departureAirport))
                .collect(Collectors.toList());
        return departures;
    }

    public List<Flight> searchArrival(String arrivalAirport) {
        System.out.println("Searching flights to: " + arrivalAirport.toUpperCase());
        List<Flight> arrivals = flightPlan.getFlights().stream()
                .filter(f -> f.getArrivalAirport().equalsIgnoreCase(arrivalAirport))
                .collect(Collectors.toList());
        return arrivals;
    }

    public List<Flight> searchVia(String departureAirport, String viaAirport, String arrivalAirport) {

        System.out.println("Searching flight from: " + departureAirport.toUpperCase() + " to: " + arrivalAirport.toUpperCase() + " via " + viaAirport.toUpperCase());

        List<Flight> via1 = flightPlan.getFlights().stream()
                .filter(f -> f.getDepartureAirport().equalsIgnoreCase(departureAirport))
                .filter(f -> f.getArrivalAirport().equalsIgnoreCase(viaAirport))
                .collect(Collectors.toList());

        List<Flight> via2 = flightPlan.getFlights().stream()
                .filter(f -> f.getDepartureAirport().equalsIgnoreCase(viaAirport))
                .filter(f -> f.getArrivalAirport().equalsIgnoreCase(arrivalAirport))
                .collect(Collectors.toList());

        List<Flight> via = new ArrayList<>(via1);
        via.addAll(via2);

        return via;
    }
}
