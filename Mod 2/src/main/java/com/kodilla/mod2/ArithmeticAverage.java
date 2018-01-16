package com.kodilla.mod2;

import java.util.ArrayList;
import java.util.Collections;

public class ArithmeticAverage {
    public void studentDegree() {
        ArrayList<Integer> studentDegree = new ArrayList<Integer>();
        studentDegree.add(6);
        studentDegree.add(5);
        studentDegree.add(4);
        studentDegree.add(3);
        studentDegree.add(2);
        studentDegree.add(1);
        studentDegree.add(2);
        studentDegree.add(3);
        studentDegree.add(4);
        studentDegree.add(5);
        studentDegree.add(6);

        System.out.println(studentDegree.size());

        Integer minDegree = Collections.min(studentDegree);
        Integer maxDegree = Collections.max(studentDegree);

        System.out.println("MIN: " + minDegree);
        System.out.println("MAX: " + maxDegree);

        studentDegree.remove(minDegree);
        studentDegree.remove(maxDegree);

        System.out.println(studentDegree.size());

        double sum = 0;
        for (int i = 0; i < studentDegree.size(); i++) {
            sum += studentDegree.get(i);
        }

        double average = sum / studentDegree.size();

        System.out.println("Average: " + average);
    }
}
