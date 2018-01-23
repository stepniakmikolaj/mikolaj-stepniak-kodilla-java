package com.kodilla.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {

    @Test
    public void testListBookWhitConditionReturnList() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Titles One", "Author One", 1999);
        Book book2 = new Book("Titleless Two", "Author Two", 2000);
        Book book3 = new Book("Titlemore Three", "Author Three", 2001);
        Book book4 = new Book("Titlescore Four", "Author Four", 2002);
        Book book5 = new Book("Title Five", "Author Five", 2003);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        resultListOfBooks.add(book5);
        when(libraryDatabaseMock.listBooksWithCondition("Title")).thenReturn(resultListOfBooks);
        //When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Title");
        //Then
        assertEquals(5, theListOfBooks.size());
    }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1000 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWhitConditionMoreThan10() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf5Books = generateListOfNBooks(5);
        List<Book> resultListOf20Books = generateListOfNBooks(20);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf5Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf20Books);
        //When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks5 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks20 = bookLibrary.listBooksWithCondition("FortyBooks");
        //Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(5, theListOfBooks5.size());
        assertEquals(20, theListOfBooks20.size());
    }

    @Test
    public void testListBookWhitConditionShorterThan3() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf10Books);
        //When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");
        //Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void testListBooksInHandsOf5Books() {
        //Given
        LibraryUser libraryUser = new LibraryUser("Mikolaj", "Stepniak", "76543210");
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> five = generateListOfNBooks(5);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(five);
        //When
        List<Book> result5 = bookLibrary.listBooksInHandsOf(libraryUser);
        //Then
        assertEquals(5, result5.size());
    }

    @Test
    public void testListBooksInHandsOf1Books() {
        //Given
        LibraryUser libraryUser = new LibraryUser("Mikolaj", "Stepniak", "76543210");
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> one = generateListOfNBooks(1);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(one);
        //When
        List<Book> result1 = bookLibrary.listBooksInHandsOf(libraryUser);
        //Then
        assertEquals(1, result1.size());
    }

    @Test
    public void testListBooksInHandsOf0Books() {
        //Given
        LibraryUser libraryUser = new LibraryUser("Mikolaj", "Stepniak", "76543210");
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> zero = generateListOfNBooks(0);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(zero);
        //When
        List<Book> result0 = bookLibrary.listBooksInHandsOf(libraryUser);
        //Then
        assertEquals(0, result0.size());
    }
}
