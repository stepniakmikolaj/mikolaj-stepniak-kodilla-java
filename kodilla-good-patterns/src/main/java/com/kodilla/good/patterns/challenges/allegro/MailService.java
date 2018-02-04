package com.kodilla.good.patterns.challenges.allegro;

public class MailService implements InformationService {

    @Override
    public void inform(OrderRequest orderRequest) {
        System.out.println("Hi" + orderRequest.getUser() + " your order " + orderRequest.getProduct() + " created " +  orderRequest.getOrder() + " will by delivered " + orderRequest.getDelivery());
    }
}
