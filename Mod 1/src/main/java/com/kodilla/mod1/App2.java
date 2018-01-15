package com.kodilla.mod1;
import com.kodilla.mod1.ATM;
import com.kodilla.mod1.ATMImpl;

public class App2 {
    public static void main (String args[]){
        ATMImpl atmImpl = new ATMImpl();

        atmImpl.atmStart();

        atmImpl.moneyTrandingIn(1000);

        atmImpl.moneyTrandingOut(500);

        System.out.println(ATM.atmEnd());
    }
}
