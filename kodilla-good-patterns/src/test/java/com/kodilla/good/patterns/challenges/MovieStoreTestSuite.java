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
        MovieStore movieStore = new MovieStore();
        //When
        movieStore.addMovieTranslation("IM", ironManTranslations);
        movieStore.addMovieTranslation("AV", avengersTranslations);
        movieStore.addMovieTranslation("FL", flashTranslations);
        List<String> movieList = movieStore.getMovies().entrySet().stream()
                .map(a -> a.getKey())
                .collect(Collectors.toList());
        //Then
        assertEquals(3, movieList.size());
    }

    @Test
    public void testRemoveMovieTranslation() {
        //Given
        MovieStore movieStore = new MovieStore();
        movieStore.addMovieTranslation("IM", ironManTranslations);
        movieStore.addMovieTranslation("AV", avengersTranslations);
        movieStore.addMovieTranslation("FL", flashTranslations);
        //When
        movieStore.removeMovieTranslation("IM");
        List<String> movieList = movieStore.getMovies().entrySet().stream()
                .map(a -> a.getKey())
                .collect(Collectors.toList());
        //Then
        assertEquals(2, movieList.size());
    }

    @Test
    public void testGetMovies() {
        //Given
        MovieStore movieStore = new MovieStore();
        movieStore.addMovieTranslation("IM", ironManTranslations);
        movieStore.addMovieTranslation("AV", avengersTranslations);
        movieStore.addMovieTranslation("FL", flashTranslations);
        //When
        movieStore.getMovies();
        List<String> movieList = movieStore.getMovies().entrySet().stream()
                .flatMap(a -> a.getValue().stream())
                .collect(Collectors.toList());

        StringJoiner stringJoiner = new StringJoiner(" ! ");
        for (String e : movieList) {
            stringJoiner.add(e);
        }
        String result = stringJoiner.toString();
        String expectedResult = "Żelazny Człowiek ! Iron Man ! Mściciele ! Avengers ! Błyskawica ! Flash";
        //Then
        assertEquals(expectedResult, result);

    }
}