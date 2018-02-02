package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;

public interface OrderService {
    boolean buyProduct(User user, Product product, LocalDateTime order, LocalDateTime delivery);
}
