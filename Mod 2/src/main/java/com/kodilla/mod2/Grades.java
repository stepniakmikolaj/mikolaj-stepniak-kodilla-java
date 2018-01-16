package com.kodilla.mod2;

import java.util.ArrayList;

public class Grades {
    ArrayList<Double> gradesList = new ArrayList<Double>();

    public void addGrade(Double grade) {
        gradesList.add(grade);
    }

    public double calculateAverage() {
        double average = 0;
        double sum = 0;
        for (Double grade : gradesList) {
            average += (double) grade;
        }
        return average / gradesList.size();
    }

    @Override
    public String toString() {
        return gradesList.toString();
    }
}
