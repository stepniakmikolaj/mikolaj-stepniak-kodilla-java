package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void testPublicationYearMedian() {
        //Given
        Book[] books = {
                new Book("", "", 1999, ""),
                new Book("", "", 2018, ""),
                new Book("", "", 1987, ""),
                new Book("", "", 2007, ""),
                new Book("", "", 2011, ""),
                new Book("", "", 1995, "")};

        Set<Book> bookSet = new HashSet<>(Arrays.asList(books));
        MedianAdapter adapter = new MedianAdapter(new MedianAdaptee());
        // When
        int medianOfYears = adapter.publicationYearMedian(bookSet);
        //Then
        System.out.println(medianOfYears);
    }

}