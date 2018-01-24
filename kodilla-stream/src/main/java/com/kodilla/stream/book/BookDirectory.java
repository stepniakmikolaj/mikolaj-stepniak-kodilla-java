package com.kodilla.stream.book;

import java.util.ArrayList;
import java.util.List;

public final class BookDirectory {
    private final List<Book> theBookList = new ArrayList<>();

    public BookDirectory() {
        theBookList.add(new Book("Mark Twain", "Tom Sower", 2000, "0001"));
        theBookList.add(new Book("Dark Vader", "How to get good relationship whit son", 2007, "0002"));
        theBookList.add(new Book("Boromir","There is not so simple go to Mordor", 2014, "0003"));
        theBookList.add(new Book("Jack Sparrow", "Why so quickly rum gone?", 1999, "0004"));
        theBookList.add(new Book("Phil Jackson", "Elewen rings", 2011, "0005"));
        theBookList.add(new Book("Bilbo Bagins", "There and Somewere", 2004, "0006"));
        theBookList.add(new Book("Connor McLoud", "Who want's to live forever", 2006, "0007"));
    }

    public List<Book> getList() {
        return new ArrayList<>(theBookList);
    }
}
