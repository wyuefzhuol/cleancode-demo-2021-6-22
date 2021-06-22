package com.tw.academy.basic.$5_data_clumps;

public class User {
    private final String name;
    private final String phoneNumber;
    private final String address;

    public User(String name, String phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getConfirmString() {
        return String.format("Please confirm buyer information: buyer name is %s, " +
                "buyer phone number is %s and buyer address is %s.", name, phoneNumber, address);
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }
}
