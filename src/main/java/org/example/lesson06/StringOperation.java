package org.example.lesson06;

import java.util.Scanner;

public class StringOperation {
    public static long getLengthRange(String str, int start, int stop) {
        String subs = str.substring(start, stop);
        return subs.trim().length();
    }

    public static String replaceOccurrences(String text, char oldChar, char newChar) {
        return text.replace(oldChar, newChar);
    }

    public static boolean compareTwoStringSpace(String textOne, String textTwo) {
        Scanner scanner = new Scanner(System.in);
        textOne = textOne.replace(" ","");
        textTwo =  textTwo.replace(" ","");
        return textOne.equals(textTwo);
    }
}

