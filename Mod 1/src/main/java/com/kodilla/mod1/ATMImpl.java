package com.kodilla.mod1;

public class ATMImpl implements ATM {
    @Override
    public void moneyTrandingIn(int payIn) {
        System.out.println("Pay IN: " + payIn);
    }

    @Override
    public void moneyTrandingOut(int payOut) {
        System.out.println("Pay OUT: " + payOut);
    }
}
