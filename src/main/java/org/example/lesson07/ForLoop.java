package org.example.lesson07;

import java.util.Scanner;

public class ForLoop {
    public static void fizzBuzz(int start, int stop) {
        if (stop > start) {
            for (; start <= stop; start++) {
                if (start % 5 == 0 && start % 3 == 0) {
                    System.out.println("FizzBuzz");
                } else if (start % 3 == 0) {
                    System.out.println("Fizz");
                } else if (start % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(start);
                }
            }
        }
    }

    public static int maxDivFour(int numQuantity) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        for (int i = 0; i < numQuantity; i++) {
            int number = scanner.nextInt();
            if(number%4 == 0 && number > max){
                max = number;
            }
        }
        return max;
    }
}
