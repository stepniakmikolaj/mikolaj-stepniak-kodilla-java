package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

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

        System.out.println("Poem Beautify");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String poem = "Tekst tekst tekst";
        poemBeautifier.beautify(poem, stringToDecorate -> "abc" + stringToDecorate + "cba");
        poemBeautifier.beautify(poem, stringToDecorate -> stringToDecorate.toUpperCase());
        poemBeautifier.beautify(poem, stringToDecorate -> stringToDecorate.toLowerCase());
        poemBeautifier.beautify(poem, stringToDecorate -> stringToDecorate.replaceFirst("Tekst", "null"));

    }
}
