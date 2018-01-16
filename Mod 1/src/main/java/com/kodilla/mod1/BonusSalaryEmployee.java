package com.kodilla.mod1;

import com.kodilla.mod1.FixedSalaryEmployee;

public class BonusSalaryEmployee extends FixedSalaryEmployee {
    private double bonusPay;
    private boolean additionalSales;

    public BonusSalaryEmployee(double fixedSalary, double bonusPay, boolean additionalSales) {
        super(fixedSalary);
        this.additionalSales = additionalSales;
        this.bonusPay = bonusPay;
    }

    public double calculateSalary() {
        if (additionalSales) {
            return getFixedSalary() * this.bonusPay + getFixedSalary();
        } else {
            return getFixedSalary();
        }
    }
}
