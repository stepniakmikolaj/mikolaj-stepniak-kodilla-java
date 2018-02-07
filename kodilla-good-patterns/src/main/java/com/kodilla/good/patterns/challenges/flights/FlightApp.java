package com.kodilla.good.patterns.challenges.flights;

public class FlightApp {

    public static void main(String[] args){

        FlightSearch flightSearch = new FlightSearch();

        System.out.println(flightSearch.searchDepartures("waw"));
        System.out.println(flightSearch.searchArrival("Gda"));
        System.out.println(flightSearch.searchIndirectFlight("WrO", "gdA", "WaW"));

    }

}
