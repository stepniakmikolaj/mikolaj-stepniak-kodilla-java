package com.kodilla.mod2;

import java.util.LinkedList;

public class BookSort {
    public void sort() {
        LinkedList<Book> list = new LinkedList<Book>();
        Book book1 = new Book("Title One", 2003);
        Book book2 = new Book("Title Two", 2001);
        Book book3 = new Book("Title Three", 1999);
        Book book4 = new Book("Title Four", 1997);
        Book book5 = new Book("Title Five", 1996);
        Book book6 = new Book("Title Six", 1998);
        Book book7 = new Book("Title Seven", 2000);
        Book book8 = new Book("Title Eight", 2002);
        Book book9 = new Book("Title Nine", 2004);

        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        list.add(book5);
        list.add(book6);
        list.add(book7);
        list.add(book8);
        list.add(book9);

        for (Book book : list) {
            if (book.getPublicationYear() >= 2000) {
                System.out.println(book);
            }
        }
    }
}
