package com.kodilla.mod3.app5;

import com.kodilla.mod3.app5.Book;

import java.util.Map;

public class HashMapBooksLibary {
    private Map<Book, String> newMap;

    public HashMapBooksLibary(Map<Book, String> newBooksMap) {
        this.newMap = newBooksMap;
    }

    int booksHashMap;

    public void addBooksToHashMapList(int booksHashMap) {
        for (int n = 0; n < booksHashMap; n++) {
            newMap.put(new Book("Title nr " + n, "Author nr " + n), "Signature nr " + n);
        }
    }

    public void hashMapProcessor() {

        System.out.println("\n2:");

        System.out.println("\nQuantity of elements in the HashMap collection: " + newMap.size());

        long begin = System.nanoTime();
        newMap.put(new Book("Title nr " + newMap.size(), "Author nr " + newMap.size()), "Signature nr " + newMap.size());
        long end = System.nanoTime();

        System.out.println("\nAdding element at the beginning of the HashMap collection has taken: " + (end - begin) + " ns");
        System.out.println("\nQuantity of elements in the HashMap collection: " + newMap.size());

        begin = System.nanoTime();
        newMap.remove(new Book("Title nr " + booksHashMap, "Author nr " + booksHashMap), "Signature nr " + booksHashMap);
        end = System.nanoTime();

        System.out.println("\nRemoving element at the beginning of the HashMap collection has taken: " + (end - begin) + " ns");
        System.out.println("\nQuantity of elements in the HashMap the collection: " + newMap.size());
        System.out.println();

    }
}