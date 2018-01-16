package com.kodilla.mod1;

import com.kodilla.mod1.SalaryPayout;

public class SalaryPayoutProcessor extends SalaryPayout {
    public SalaryPayoutProcessor(Employee employee){
        super(employee);
    }
    protected void payout(){
        System.out.println("Sending salary");
    }
}
