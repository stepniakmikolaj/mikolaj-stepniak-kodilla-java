package com.kodilla.mod1;

public abstract class SalaryPayout {
    private Employee employee;

    public SalaryPayout(Employee employee) {
        this.employee = employee;
    }

    protected abstract void payout();

    public void processPayout(){
        System.out.println("Payment for: " + this.employee.calculateSalary() + " PLN");
        this.payout();
        System.out.println("Payout complited");
    }
}
