package com.kodilla.good.patterns.challenges.allegro;

public class OrderDto {
    public User user;
    public boolean isBought;

    public OrderDto(User user, boolean isBought) {
        this.user = user;
        this.isBought = isBought;
    }

    public User getUser() {
        return user;
    }

    public boolean isBought() {
        return isBought;
    }
}
