package com.kodilla.mod3.app5;

public class Book {

    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean equals(Object o) {
        final Book e = (Book) o;
        return (author.equals(e.getAuthor())) &&
                (title.equals(e.getTitle()));
    }

    public int hashCode() {
        int hash;
        hash = author.hashCode() * title.hashCode();
        return hash;
    }
}