package com.kodilla.good.patterns.challenges;

import java.util.*;
import java.util.stream.Collectors;

public class MovieStore {

    Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();

    public void addMovieTranslation(String name, List<String> translations) {
        booksTitlesWithTranslations.put(name, translations);
    }

    public boolean removeMovieTranslation(String name, List<String> translations) {
        return booksTitlesWithTranslations.remove(name, translations);
    }

    public Map<String, List<String>> getMovies() {

        return booksTitlesWithTranslations;
    }

    public static void main(String[] args) {

        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        List<String> someTranslations = new ArrayList<>();
        someTranslations.add("Jakieś");
        someTranslations.add("Some");

        MovieStore movieStore = new MovieStore();

        movieStore.addMovieTranslation("IM", ironManTranslations);
        movieStore.addMovieTranslation("AV", avengersTranslations);
        movieStore.addMovieTranslation("FL", flashTranslations);
        movieStore.addMovieTranslation("SO", someTranslations);
        movieStore.removeMovieTranslation("SO", someTranslations);

        List<String> movieList = movieStore.getMovies().entrySet().stream()
                .flatMap(a -> a.getValue().stream())
                .collect(Collectors.toList());

        StringJoiner stringJoiner = new StringJoiner(" ! ");
        for (String e : movieList) {
            stringJoiner.add(e);
        }

        System.out.println(stringJoiner);

    }
}
