package com.kodilla.mod1;

import com.kodilla.mod1.Employee;

public class ProductSalaryEmployee implements Employee {
    private int productNumber;
    private double productPay;

    public ProductSalaryEmployee(int productNumber, double productPay){
        this.productNumber = productNumber;
        this.productPay = productPay;
    }

    public double calculateSalary(){
        return this.productPay * this.productNumber;
    }
}
