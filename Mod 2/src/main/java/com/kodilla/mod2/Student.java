package com.kodilla.mod2;

public class Student {
    private String firstName;
    private String lastName;
    private String idNumber;

    public Student(String firstName, String lastName, String idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    @Override
    public boolean equals(Object o) {
        final Student s = (Student) o;
        return this.firstName.equals(s.firstName) && this.lastName.equals(s.lastName) && this.idNumber.equals(s.idNumber);
    }

    public int hashCode() {
        return Integer.parseInt(idNumber.substring(0));
    }

    public String toString() {
        return "No. " + idNumber + " " + lastName + " " + firstName + "\nGrades: ";
    }
}
