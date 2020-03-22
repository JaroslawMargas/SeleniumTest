package org.example.lesson08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class SequenceOrder {

    private static final Pattern PATTERN = Pattern.compile(" ");

    public static boolean checkSeq(String numberString) {
        String[] numbersArray = PATTERN.split(numberString);
        List<Integer> numbers = new ArrayList<>(numbersArray.length);
        List<Integer> sortedNumbers = new ArrayList<>();
        for (String s : numbersArray) {
            int i = Integer.parseInt(s);
            if (i == 0) {
                // zero ends input
                break;
            }
            numbers.add(i);
            sortedNumbers.add(i);
        }
        Collections.sort(sortedNumbers);
        if (numbers.equals(sortedNumbers)) {
            return true;
        }
        sortedNumbers.sort(Collections.reverseOrder());
        return numbers.equals(sortedNumbers);
    }
}
