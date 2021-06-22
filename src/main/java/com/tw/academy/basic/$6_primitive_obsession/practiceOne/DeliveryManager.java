package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class DeliveryManager {
    Address toAddress;
    Address fromAddress;

    public DeliveryManager(Address fromAddress, Address toAddress) {
        this.toAddress = toAddress;
        this.fromAddress = fromAddress;
    }

    public DeliverCenter allocate(){
        if (this.toAddress.getProvince().equals(this.fromAddress.getProvince()) && this.toAddress.getCity().equals(this.fromAddress.getCity())){
            return DeliverCenter.LOCAL;
        }
        if (this.toAddress.getProvince().equals(this.fromAddress.getProvince())) {
            return DeliverCenter.PROVINCE;
        }
        return DeliverCenter.FOREIGN;
    }
}
