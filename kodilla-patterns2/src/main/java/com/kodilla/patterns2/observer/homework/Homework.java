package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Homework implements Observable {
    private final List<Observer> observers;
    private final Deque<String> homeworks;
    private final String studentName;

    public Homework(String studentName) {
        observers = new ArrayList<>();
        homeworks = new ArrayDeque<>();
        this.studentName = studentName;
    }

    public void addHomework(String homework) {
        this.homeworks.add(homework);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public Deque<String> getHomeworks() {
        return homeworks;
    }

    public String getStudentName() {
        return studentName;
    }
}
