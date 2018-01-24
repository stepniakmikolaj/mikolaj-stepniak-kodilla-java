package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;

public final class World {
    private final List<Continent> listOfContinents;

    public World(final List<Continent> listOfContinents) {
        this.listOfContinents = listOfContinents;
    }

    public BigDecimal getPeopleQuantity() {
        return listOfContinents.stream()
                .flatMap(continent -> continent.getListCountries().stream())
                    .map(Country::getPeopleQuantity)
                    .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}