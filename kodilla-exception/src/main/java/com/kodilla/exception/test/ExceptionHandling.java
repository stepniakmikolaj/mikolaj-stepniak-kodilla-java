package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String args[]){
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        exceptionHandling.handleAnException();
    }

    public void handleAnException(){
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            System.out.println(secondChallenge.probablyIWillThrowException(1,1.5));
        } catch (Exception e) {
            System.out.println("(x >= 2 || x < 1 || y == 1.5)" +
                    "" +
                    "\nChange double x or double y" + e);
        } finally {
            System.out.println("I'm finally. I'm always");
        }
    }
}
