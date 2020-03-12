package org.example.lesson07;

public class ForLoop {
    public static void FizzBuzz(int start, int stop) {
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
}
