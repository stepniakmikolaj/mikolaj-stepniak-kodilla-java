package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;

public interface OrderRepository {
    boolean buyProduct(User user, Product product, LocalDateTime order, LocalDateTime delivery);
}
