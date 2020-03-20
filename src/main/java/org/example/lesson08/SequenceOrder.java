package org.example.lesson08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SequenceOrder {

    public static boolean checkSeq(String numberString) {
        boolean result = false;
        List<Integer> intList = new ArrayList<>();

        String[] numbersArray = numberString.split(" ");

        for (String num : numbersArray) {
            int number = Integer.parseInt(num);
            if (number != 0) {
                intList.add(number);
            }
        }

        // copy of list
        List<Integer> listSorted = new ArrayList<>(intList);
        // sort copy
        Collections.sort(listSorted);

        //iterate through list
        for (Integer itmList : intList) {
            // if first < any next
            if (intList.get(0) < itmList) {
                // check if list = sortedList
                if (intList.equals(listSorted)) {
                    result = true;
                    break;
                }
            }

            // if first > any next
            if (intList.get(0) > itmList) {
                // reverse sortedList
                Collections.reverse(listSorted);
                // check if list = reversed sortedList
                if (intList.equals(listSorted)) {
                    result = true;
                    break;
                }
            }

            // if all elements are the same
            // if (occurrence element [0] in intList == size List) -> true
            result = Collections.frequency(intList, intList.get(0)) == intList.size();
        }
        return result;
    }
}