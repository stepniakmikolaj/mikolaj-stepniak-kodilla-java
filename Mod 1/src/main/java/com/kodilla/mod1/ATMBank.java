package com.kodilla.mod1;

public class ATMBank extends Bank {
    @Override
    protected void requestCardInsert() {
        System.out.println("Insert Card - ATM");
    }

    @Override
    protected void requestPinCode() {
        System.out.println("PIN - ATM");
    }

    @Override
    protected void requestChooseAmount() {
        System.out.println("Choose Amount - ATM");
    }

    @Override
    protected void cashWithdrawal() {
        System.out.println("Cash Withdrawal - ATM");
    }

    @Override
    protected void thanksUsingBankServices() {
        System.out.println("Thank You for using Bank services - ATM");
    }
}
