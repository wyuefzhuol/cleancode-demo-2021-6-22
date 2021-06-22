package com.tw.academy.basic.$5_data_clumps;

public class Order {

    private final int orderNumber;
    private final User user;

    public Order(int orderNumber, String buyerName, String buyerPhoneNumber, String buyerAddress) {
        this.orderNumber = orderNumber;
        this.user = new User(buyerName, buyerPhoneNumber, buyerAddress);
    }

    public String confirm(){
        return user.getConfirmString();
    }
}

