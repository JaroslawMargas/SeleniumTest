package org.example.lesson09;

public class OrderString {
    public static boolean checkOrder(String str) {
        String mySimple = "abcdefghijklmnopqrstuvwxyz";
        char first = str.charAt(0);
        int index = mySimple.indexOf(first);
        boolean result = false;


        if (str.length() != 1) {
            for (int i = 0; i < str.length(); i++) {
                result = str.charAt(i) == mySimple.charAt(i + index);
            }
        }else {
            result = true;
        }
        return result;
    }
}
