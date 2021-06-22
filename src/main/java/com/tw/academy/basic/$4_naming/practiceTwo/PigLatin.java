package com.tw.academy.basic.$4_naming.practiceTwo;

public class PigLatin {
    private static final String SPACE = " ";
    private static final String END_WORD = "ay";
    private static final String[] PUNCTUATION_MARKS = {".",",","-",":",";","!","?"};

    //Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
    public static String pigIt(String sentence) {
        String[] words = sentence.split(SPACE);
        char firstLetter;
        boolean notPunctuation = true;

        for (int wordNum = 0; wordNum < words.length; wordNum++){
            for (String ingoreChar : PUNCTUATION_MARKS)
                if (words[wordNum].contains(ingoreChar)) {
                    notPunctuation = false;
                    break;
                }

            if (notPunctuation){
                firstLetter = words[wordNum].charAt(0);
                words[wordNum] = words[wordNum].substring(1);
                words[wordNum] = words[wordNum].replace(words[wordNum], words[wordNum] + firstLetter + END_WORD);
            }
            notPunctuation = true;
        }

        return String.join(SPACE, words);
    }
}
