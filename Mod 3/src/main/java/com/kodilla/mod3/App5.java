package com.kodilla.mod3;

import com.kodilla.mod3.app5.*;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class App5 {
    public static void main(String[] args) throws java.lang.Exception {
        LinkedList<Book> theList = new LinkedList<Book>();
        Map<Book, String> newMap = new HashMap<Book, String>();
        LinkedListBooksLibrary process = new LinkedListBooksLibrary(theList);
        process.addBooksToLinkedList(500000);
        process.linkedListProcessor();
        HashMapBooksLibary processor = new HashMapBooksLibary(newMap);
        processor.addBooksToHashMapList(500000);
        processor.hashMapProcessor();
    }
}