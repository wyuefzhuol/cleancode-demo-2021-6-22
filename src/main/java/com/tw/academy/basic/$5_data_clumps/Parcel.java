package com.tw.academy.basic.$5_data_clumps;

public class Parcel {
    private String size;
    private Double weight;

    private String receiverName;
    private String receiverPhoneNumber;
    private String receiverAddress;

    private String senderName;
    private String senderPhoneNumber;
    private String senderAddress;

    private final User receiver;

    public Parcel(String size, Double weight,
                  User receiver, String senderName, String senderPhoneNumber, String senderAddress) {
        this.size = size;
        this.weight = weight;
        this.receiverName = receiver.getName();
        this.receiverPhoneNumber = receiver.getPhoneNumber();
        this.receiverAddress = receiver.getAddress();
        this.senderName = senderName;
        this.senderPhoneNumber = senderPhoneNumber;
        this.senderAddress = senderAddress;

        this.receiver = receiver;
    }

    public String confirmReceiver(){
        return String.format("Please confirm receiver information: receiver name is %s, " +
                        "receiver phone number is %s and receiver address is %s.\n",
                this.receiver.getName(), receiverPhoneNumber, receiverAddress);
    }

    public String confirmSender(){
        return String.format("Please confirm sender information: sender name is %s, " +
                        "sender phone number is %s and sender address is %s.\n",
                senderName, senderPhoneNumber, senderAddress);
    }
}
