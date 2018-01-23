package com.kodilla.stream.lambda;

public class ExecuteSaySomething implements Executor {
    @Override
    public void process() {
        System.out.println("I'm void process() of class ExecuteSaySomething and I implements interface Executor");
    }
}
