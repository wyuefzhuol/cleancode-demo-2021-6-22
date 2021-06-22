package com.tw.academy.basic.$3_feature_envy.practiceOne;

public class Phone {
    private final String areaCode;
    private final String prefix;
    private final String number;
    public Phone(String unformattedNumber) {
        areaCode = unformattedNumber.substring(0,3);
        prefix = unformattedNumber.substring(3,6);
        number = unformattedNumber.substring(6,10);
    }
    public String getMobilePhoneNumber() {
        return "(" + areaCode + ") " + prefix + "-" + number;
    }
}
