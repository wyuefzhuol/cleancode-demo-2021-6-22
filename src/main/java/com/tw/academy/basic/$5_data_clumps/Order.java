package com.tw.academy.basic.$5_data_clumps;

public class Order {

    private final int orderNumber;
    private final User buyer;

    public Order(int orderNumber, User user) {
        this.orderNumber = orderNumber;
        this.buyer = user;
    }

    public Order(int orderNumber, String buyerName, String buyerPhoneNumber, String buyerAddress) {
        this.orderNumber = orderNumber;
        this.buyer = new User(buyerName, buyerPhoneNumber, buyerAddress);
    }

    public String confirm(){
        return buyer.getConfirmString();
    }
}

