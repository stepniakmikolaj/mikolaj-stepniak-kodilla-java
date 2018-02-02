package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository {
    @Override
    public boolean buyProduct(User user, Product product, LocalDateTime order, LocalDateTime delivery) {
        return false;
    }
}
