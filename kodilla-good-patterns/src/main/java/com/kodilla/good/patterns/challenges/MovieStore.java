package com.kodilla.good.patterns.challenges;

import java.util.*;
import java.util.stream.Collectors;

public class MovieStore {

    Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();

    public void addMovieTranslation(String name, List<String> translations) {
        booksTitlesWithTranslations.put(name, translations);
    }

    public List<String> removeMovieTranslation(String name) {
        return booksTitlesWithTranslations.remove(name);
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

        List<String> blackPantherTranslations = new ArrayList<>();
        blackPantherTranslations.add("Czarna Pantera");
        blackPantherTranslations.add("Black Panther");

        MovieStore movieStore = new MovieStore();

        movieStore.addMovieTranslation("IM", ironManTranslations);
        movieStore.addMovieTranslation("AV", avengersTranslations);
        movieStore.addMovieTranslation("FL", flashTranslations);
        movieStore.addMovieTranslation("BP", blackPantherTranslations);
        movieStore.removeMovieTranslation("BP");

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
