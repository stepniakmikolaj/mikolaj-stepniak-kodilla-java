package com.kodilla.stream.immutable;

public final class Book {
    private final String title;
    private final String author;
    private final int publicationYear;

    public Book(final String title, final String author, final int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
}
