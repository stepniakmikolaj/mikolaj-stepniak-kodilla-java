package com.kodilla.good.patterns.challenges.allegro;

public class User {

    private final String userName;
    private final String email;
    private final char accountTypeForBuyerBForSellerS;

    public User(String userName, String email, char accountTypeForBuyerBforSellerS) {
        this.userName = userName;
        this.email = email;
        this.accountTypeForBuyerBForSellerS = accountTypeForBuyerBforSellerS;
    }

    public String getUserName() {
        return userName;
    }

    public char getAccountTypeForBuyerBforSellerS() {
        return accountTypeForBuyerBForSellerS;
    }

    public String getEmail() {
        return email;
    }
}
