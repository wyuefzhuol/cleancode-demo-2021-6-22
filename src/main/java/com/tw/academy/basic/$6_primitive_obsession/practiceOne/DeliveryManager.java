package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class DeliveryManager {
    String toAddress;
    String fromAddress;

    Address fromAdd;

    public DeliveryManager(Address address, String toAddress) {
        this.toAddress = toAddress;
        this.fromAddress = address.getFromAddress();

        this.fromAdd = address;
    }

    public DeliverCenter allocate(){
        if (getProvince(toAddress).equals(this.fromAdd.getProvince()) && getCity(toAddress).equals(this.fromAdd.getCity())){
            return DeliverCenter.LOCAL;
        }
        if (getProvince(toAddress).equals(this.fromAdd.getProvince())) {
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
