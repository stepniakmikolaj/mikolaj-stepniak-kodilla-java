package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<com.kodilla.patterns2.adapter.bookclassifier.librarya.Book> bookSet) {
        Map<BookSignature, Book> bookMap = new HashMap<>();
        for (com.kodilla.patterns2.adapter.bookclassifier.librarya.Book bookA : bookSet) {
            BookSignature signature = new BookSignature(bookA.getSignature());
            Book bookB = new Book(
                    bookA.getAuthor(),
                    bookA.getTitle(),
                    bookA.getPublicationYear());
            bookMap.put(signature, bookB);
        }
        return medianPublicationYear(bookMap);
    }
}
