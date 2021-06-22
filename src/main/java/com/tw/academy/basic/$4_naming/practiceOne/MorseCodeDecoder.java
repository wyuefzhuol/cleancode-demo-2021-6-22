package com.tw.academy.basic.$4_naming.practiceOne;

import java.util.Arrays;

public class MorseCodeDecoder {
    public static String decode(String input) {
        String[] tempValue = input.split("\\s{2,}");
        StringBuilder res = new StringBuilder();
        Arrays.stream(tempValue).forEach(temp -> {
            Arrays.stream(temp.split(" ")).forEach(charItem -> res.append(MorseCode.getMorseLibToEnglishMap(charItem)));
            res.append(" ");
        });
        return res.toString().replaceAll("null", "").trim();
    }
}
