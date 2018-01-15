package com.kodilla.mod1;

interface ATM {
    void moneyTrandingIn(int payIn);

    void moneyTrandingOut(int payOut);

    default void atmStart(){
        System.out.println("Welcome in ATM\nEnter PIN");
    }

    static String atmEnd() {
        return "Thank You for using ATM";
    }
}
