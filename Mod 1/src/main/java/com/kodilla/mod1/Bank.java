package com.kodilla.mod1;

public abstract class Bank {
    abstract protected void requestCardInsert();

    abstract protected void requestPinCode();

    abstract protected void requestChooseAmount();

    private void requestInformation() {
        System.out.println("Request Information - BANK");
    }

    private void checkingAccountBalance() {
        System.out.println("Checking Account Ballance - BANK");
    }

    private void confirmationPayment() {
        System.out.println("Confirmation Payment - BANK");
    }

    abstract protected void cashWithdrawal();

    abstract protected void thanksUsingBankServices();

    public void ATMrun() {
        this.requestCardInsert();
        this.requestPinCode();
        this.requestChooseAmount();
        this.requestInformation();
        this.checkingAccountBalance();
        this.confirmationPayment();
        this.cashWithdrawal();
        this.thanksUsingBankServices();
    }
}
