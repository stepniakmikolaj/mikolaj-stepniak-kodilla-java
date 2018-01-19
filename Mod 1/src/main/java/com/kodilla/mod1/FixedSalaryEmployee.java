package com.kodilla.mod1;

public class FixedSalaryEmployee implements Employee {
    private double fixedSalary;

    public FixedSalaryEmployee(double fixedSalary) {

        this.fixedSalary = fixedSalary;

    }

    public double getFixedSalary() {

        return fixedSalary;
    }

    public double calculateSalary() {

        return this.fixedSalary;
    }
}
