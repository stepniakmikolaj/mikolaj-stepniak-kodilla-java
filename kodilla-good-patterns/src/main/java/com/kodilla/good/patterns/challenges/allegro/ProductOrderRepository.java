package com.kodilla.good.patterns.challenges.allegro;

import java.util.ArrayList;
import java.util.List;

public class ProductOrderRepository implements OrderRepository {

    public List<Product> allegro = new ArrayList<>();

    public void addProduct(Product product){
        allegro.add(product);
    }

    public boolean removeProduct(Product product) {
        return allegro.remove(product);
    }

    @Override
    public boolean saveOrder(OrderRequest orderRequest) {
        return false;
    }
}
