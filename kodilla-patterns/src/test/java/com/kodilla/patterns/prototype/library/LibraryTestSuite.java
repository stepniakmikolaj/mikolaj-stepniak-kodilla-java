package com.kodilla.patterns.prototype.library;

import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //G
        Library library = new Library("Biblioteka Narodowa");
        IntStream.iterate(1, n -> n + 1)
                .limit(8)
                .forEach(n -> library.getBooks().add(new Book("Title" + n, "Author" + n, LocalDate.of(2000 + n,1 + n,1 + n))));

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Biblioteka Narodowa shallowCopy()");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Biblioteka Narodowa deepCopy()");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //W
        library.getBooks().add(new Book("Title9", "Author9", LocalDate.of(2009,10,10)));

        //T
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(9, library.getBooks().size());
        assertEquals(9, clonedLibrary.getBooks().size());
        assertEquals(8, deepClonedLibrary.getBooks().size());
        assertEquals(library.getBooks().size(), clonedLibrary.getBooks().size());
        assertNotEquals(library.getBooks().size(), deepClonedLibrary.getBooks().size());
    }
}