package com.tw.academy.basic.$5_data_clumps;

public class Parcel {
    private String size;
    private Double weight;

    private String senderName;
    private String senderPhoneNumber;
    private String senderAddress;

    private final User receiver;
    private final User sender;

    public Parcel(String size, Double weight,
                  User receiver, User sender) {
        this.size = size;
        this.weight = weight;
        this.senderName = sender.getName();
        this.senderPhoneNumber = sender.getPhoneNumber();
        this.senderAddress = sender.getAddress();

        this.receiver = receiver;
        this.sender = sender;
    }

    public String confirmReceiver(){
        return String.format("Please confirm receiver information: receiver name is %s, " +
                        "receiver phone number is %s and receiver address is %s.\n",
                this.receiver.getName(), this.receiver.getPhoneNumber(), this.receiver.getAddress());
    }

    public String confirmSender(){
        return String.format("Please confirm sender information: sender name is %s, " +
                        "sender phone number is %s and sender address is %s.\n",
                getSenderName(), senderPhoneNumber, senderAddress);
    }

    private String getSenderName() {
        return senderName;
    }
}
