package com.kodilla.good.patterns.challenges;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class MovieStoreTestSuite {

    List<String> ironManTranslations = new ArrayList<>();

    {
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");
    }


    List<String> avengersTranslations = new ArrayList<>();

    {
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");
    }

    List<String> flashTranslations = new ArrayList<>();

    {
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");
    }

    @Test
    public void testAddMovieTranslation() {
        //Given
        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        //When
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);
        //Then
        assertEquals(2, booksTitlesWithTranslations.size());
    }

    @Test
    public void testRemoveMovieTranslation() {
        //Given
        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        //When
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.remove("IM", ironManTranslations);
        //Then
        assertEquals(0, booksTitlesWithTranslations.size());
    }

    @Test
    public void testGetMovies() {
        //Given
        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);
        //When
        MovieStore movieStore = new MovieStore();
        movieStore.getMovies();
        List<String> movieList = movieStore.getMovies().entrySet().stream()
                .flatMap(a -> a.getValue().stream())
                .collect(Collectors.toList());

        StringJoiner stringJoiner = new StringJoiner(" ! ");
        for (String e : movieList) {
            stringJoiner.add(e);
        }

        String expectedResult = "Żelazny Człowiek ! Iron Man ! Mściciele ! Avengers ! Błyskawica ! Flash";
        //Then
        assertEquals(expectedResult, stringJoiner);

    }
}