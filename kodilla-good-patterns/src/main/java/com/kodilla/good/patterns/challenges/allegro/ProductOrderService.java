package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ProductOrderService implements OrderService {

    public List<Product> allegro = new ArrayList<>();

    public void addProduct(Product product){
        allegro.add(product);
    }

    public boolean removeProduct(Product product) {
        return allegro.remove(product);
    }

    @Override
    public boolean buyProduct(User user, Product product, LocalDateTime order, LocalDateTime delivery) {
        return false;
    }
}
