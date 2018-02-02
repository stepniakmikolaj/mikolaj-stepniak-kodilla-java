package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve(){
        User user = new User("Miki", "miki@miki.pl", 'B');
        Product product = new Product("Game", 99.99);

        LocalDateTime order = LocalDateTime.of(2018, 02, 02, 14,04);
        LocalDateTime delivery = order.plusDays(5);

        return new OrderRequest(user, order, delivery, product);
    }
}
