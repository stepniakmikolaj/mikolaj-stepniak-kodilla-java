package com.kodilla.mod2;

import java.util.HashMap;
import java.util.Map;

public class App4 {
    public static void main(String[] args) {
        Grades grades1 = new Grades();
        grades1.addGrade(4.5);
        grades1.addGrade(3.5);
        grades1.addGrade(5.5);
        grades1.addGrade(4.75);
        grades1.addGrade(2.5);
        grades1.addGrade(4.5);

        Grades grades2 = new Grades();
        grades2.addGrade(5.0);
        grades2.addGrade(6.0);
        grades2.addGrade(4.0);
        grades2.addGrade(5.0);
        grades2.addGrade(6.0);
        grades2.addGrade(4.0);
        grades2.addGrade(5.0);
        grades2.addGrade(6.0);
        grades2.addGrade(4.0);

        Grades grades3 = new Grades();
        grades3.addGrade(6.0);
        grades3.addGrade(5.0);
        grades3.addGrade(4.0);
        grades3.addGrade(3.0);
        grades3.addGrade(2.0);
        grades3.addGrade(1.0);

        Grades grades4 = new Grades();
        grades4.addGrade(1.0);
        grades4.addGrade(1.5);
        grades4.addGrade(1.75);
        grades4.addGrade(2.0);
        grades4.addGrade(2.5);
        grades4.addGrade(2.75);
        grades4.addGrade(3.0);
        grades4.addGrade(3.5);
        grades4.addGrade(3.75);
        grades4.addGrade(4.0);
        grades4.addGrade(4.5);
        grades4.addGrade(4.75);
        grades4.addGrade(5.0);
        grades4.addGrade(5.5);
        grades4.addGrade(5.75);
        grades4.addGrade(6.0);

        Student student1 = new Student("Adam", "Adamski", "1");
        Student student2 = new Student("Monika", "Moniewska", "2");
        Student student3 = new Student("Zosia", "Sprytna", "3");
        Student student4 = new Student("Waclaw", "Waclawski", "4");

        HashMap<Student, Grades> studentClass = new HashMap<Student, Grades>();

        studentClass.put(student1, grades1);
        studentClass.put(student2, grades2);
        studentClass.put(student3, grades3);
        studentClass.put(student4, grades4);


        for (Map.Entry<Student, Grades> entry : studentClass.entrySet()) {

            System.out.println(entry.getKey() + "\n" + entry.getValue() + "\naverage score: " + entry.getValue().calculateAverage());
            System.out.println();
        }
    }
}