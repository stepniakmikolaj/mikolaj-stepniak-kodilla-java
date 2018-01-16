package com.kodilla.mod3;

import com.kodilla.mod3.app1.Book;

import java.util.ArrayDeque;

public class App2 {
    public static void main(String[] args) throws java.lang.Exception {
        // Create 5 sample books
        Book theBook1 = new Book("Book One", "Author One", 1999);
        Book theBook2 = new Book("Book Two", "Author Two", 2000);
        Book theBook3 = new Book("Book Three", "Author Three", 2001);
        Book theBook4 = new Book("Book Four", "Author Four", 2002);
        Book theBook5 = new Book("Book Five", "Author Five", 2003);

        System.out.println("Creating the stack.");
        System.out.println("The stack has been created!");

        ArrayDeque<Book> theBooks = new ArrayDeque<Book>();

        System.out.println("Actual stack size: " + theBooks.size());
        System.out.println("Add Books to the stack!");
        System.out.println("Books have been added");

        theBooks.push(theBook5);
        theBooks.push(theBook4);
        theBooks.push(theBook3);
        theBooks.push(theBook2);
        theBooks.push(theBook1);

        System.out.println("Stack size: " + theBooks.size());

        System.out.println("Removing Books from the stack.");
        System.out.println("The stack has been deleted:");

        Book deleteBooks = null;
        while (theBooks.size() > 0) {
            deleteBooks = theBooks.pop();
        }

        System.out.println("Stack size: " + theBooks.size());

        System.out.println("Last Book deleted from Stack was:\n" + deleteBooks);
        System.out.println();

    }
}