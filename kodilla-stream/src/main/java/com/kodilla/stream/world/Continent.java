package com.kodilla.stream.world;

import java.util.List;

public final class Continent {
    private final String nameContinent;
    private final List<Country> ListOfCountries;

    public Continent(final String nameContinent, final List<Country> ListOfCountries) {
        this.nameContinent = nameContinent;
        this.ListOfCountries = ListOfCountries;
    }

    public String getNameContinent() {

        return nameContinent;
    }

    public List<Country> getListCountries() {

        return ListOfCountries;
    }
}