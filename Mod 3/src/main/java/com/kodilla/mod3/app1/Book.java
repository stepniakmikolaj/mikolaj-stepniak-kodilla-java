package com.kodilla.mod3.app1;

public class Book {
    String title;
    String author;
    int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public int hashCode() {
        return getPublicationYear();
    }

    public boolean equals(Object o) {
        Book e = (Book) o;
        return (title.equals(e.getTitle())) &&
                (author.equals(e.getAuthor()));
    }

    public String toString() {
        return author + ", " + title + ", " + publicationYear;
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
