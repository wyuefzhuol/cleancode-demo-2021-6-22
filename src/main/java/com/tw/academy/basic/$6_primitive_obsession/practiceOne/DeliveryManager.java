package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class DeliveryManager {
    String toAddress;
    Address fromAddress;

    Address toAdd;

    public DeliveryManager(Address fromAddress, Address toAddress) {
        this.toAddress = toAddress.getAddress();
        this.fromAddress = fromAddress;

        this.toAdd = toAddress;
    }

    public DeliverCenter allocate(){
        if (getProvince(toAddress).equals(this.fromAddress.getProvince()) && getCity(toAddress).equals(this.fromAddress.getCity())){
            return DeliverCenter.LOCAL;
        }
        if (getProvince(toAddress).equals(this.fromAddress.getProvince())) {
            return DeliverCenter.PROVINCE;
        }
        return DeliverCenter.FOREIGN;
    }

    private String getCity(String address) {
        return address.substring(address.indexOf("省") + 1, address.indexOf("市"));
    }

    private String getProvince(String address) {
        return address.substring(0, address.indexOf("省"));
    }
}
