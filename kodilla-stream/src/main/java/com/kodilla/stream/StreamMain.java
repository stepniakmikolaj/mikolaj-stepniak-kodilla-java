package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        processor.execute(() -> System.out.println("I'm Lambda\n"));

        System.out.println("Calculating expressions with Lambda");
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeMathExpression(2.9, 3.5, (a, b) -> a + b);
        expressionExecutor.executeMathExpression(43.7, 33.3, (a, b) -> a - b);
        expressionExecutor.executeMathExpression(4.6, 5.5, (a, b) -> a * b);
        expressionExecutor.executeMathExpression(81.6, 7.2, (a, b) -> a / b);
        System.out.println("----------------------------------------------");

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeMathExpression(2.9, 3.5, FunctionalCalculator::addAToB);
        expressionExecutor.executeMathExpression(43.7, 33.3, FunctionalCalculator::subBFromA);
        expressionExecutor.executeMathExpression(4.6, 5.5, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeMathExpression(81.6, 7.2, FunctionalCalculator::divideAByB);
        System.out.println("----------------------------------------------");

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.genetateEven(20);
        System.out.println("----------------------------------------------");

        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 5)
                .map(s -> s.substring(0, s.indexOf(' ') + 5) + ".")
                .filter(s -> s.substring(0, 3).equals("MAR"))
                .forEach(System.out::println);

        System.out.println("----------------------------------------------");

        BookDirectory theBookDirectory = new BookDirectory();
        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n", "<<", ">>"));

        System.out.println(theResultStringOfBooks);

    }
}
