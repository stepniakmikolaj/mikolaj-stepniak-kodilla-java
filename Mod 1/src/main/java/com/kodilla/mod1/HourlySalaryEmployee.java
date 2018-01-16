package com.kodilla.mod1;

public class HourlySalaryEmployee implements Employee {
    private double hours;
    private double hourlyPay;

    public HourlySalaryEmployee(double hours, double hourlyPay){
        this.hours = hours;
        this.hourlyPay = hourlyPay;
    }

    public double calculateSalary(){
        return this.hourlyPay * this.hours;
    }
}
