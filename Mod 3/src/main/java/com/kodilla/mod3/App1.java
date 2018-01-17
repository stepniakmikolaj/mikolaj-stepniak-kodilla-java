package com.kodilla.mod3;

import com.kodilla.mod3.app1.Book;

import java.util.HashSet;

public class App1 {
    public static void main(String[] args) throws java.lang.Exception {

        Book book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954);
        Book book2 = new Book("Hobbit", "J.R.R. Tolkien", 1937);
        Book book3 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954);
        Book book4 = new Book("Tytul", "Autor", 1999);
        Book book5 = new Book("Dallas '63", "Stephen King", 2011);
        Book book6 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1999);

        HashSet<Book> booksSet = new HashSet<Book>();
        booksSet.add(book1);
        booksSet.add(book1);
        booksSet.add(book2);
        booksSet.add(book3);
        booksSet.add(book4);
        booksSet.add(book5);
        booksSet.add(book6);

        for (Book theBook : booksSet) {
            if (theBook.getPublicationYear() <= 2010) {
                System.out.println(theBook);
            }

        }
    }
}