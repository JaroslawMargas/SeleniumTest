package org.example.lesson07;

public class Leap {
    public static String checkLeapYaar(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return ("Leap");
        } else {
            return ("Regular");
        }
    }
}

