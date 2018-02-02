package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;

public class OrderRequest {
    public User user;
    public LocalDateTime order;
    public LocalDateTime delivery;
    public Product product;

    public OrderRequest(User user, LocalDateTime order, LocalDateTime delivery, Product product) {
        this.user = user;
        this.order = order;
        this.delivery = delivery;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrder() {
        return order;
    }

    public LocalDateTime getDelivery() {
        return delivery;
    }

    public Product getProduct() {
        return product;
    }
}
