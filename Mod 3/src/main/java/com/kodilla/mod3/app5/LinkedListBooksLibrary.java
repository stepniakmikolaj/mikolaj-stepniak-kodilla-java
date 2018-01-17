package com.kodilla.mod3.app5;

import com.kodilla.mod3.app5.Book;

import java.util.LinkedList;

public class LinkedListBooksLibrary {

    private LinkedList<Book> theList;

    public LinkedListBooksLibrary(LinkedList<Book> newList) {
        this.theList = newList;
    }

    int booksNumber;

    public void addBooksToLinkedList(int booksNumber) {
        for (int n = 0; n < booksNumber; n++) {
            theList.add(new Book("Author nr " + n, "Title nr " + n));
        }
    }

    public void linkedListProcessor() {
        System.out.println("1:");

        System.out.println("\nQuantity of elements in the LinkedList collection: " + theList.size());

        long begin = System.nanoTime();
        theList.remove(new Book("Author nr " + 0, "Title nr " + 0));
        long end = System.nanoTime();

        System.out.println("\nRemoving first element: " + (end - begin) + " ns");

        begin = System.nanoTime();
        theList.remove(new Book("Author nr " + 499999, "Title nr " + 499999));
        end = System.nanoTime();

        System.out.println("\nRemoving last element: " + (end - begin) + " ns");

        System.out.println("\nQuantity of elements in the LinkedList collection: " + theList.size());

        begin = System.nanoTime();
        theList.addLast(new Book("Author nr " + booksNumber, "Title nr " + booksNumber));
        end = System.nanoTime();

        System.out.println("\nAdding element at the end: " + (end - begin) + " ns");

        begin = System.nanoTime();
        theList.addFirst(new Book("Author nr " + booksNumber, "Title nr " + booksNumber));
        end = System.nanoTime();

        System.out.println("\nAdding element at the beginning: " + (end - begin) + " ns");

        System.out.println("\nQuantity of elements in the LinkedList collection: " + theList.size());
    }
}