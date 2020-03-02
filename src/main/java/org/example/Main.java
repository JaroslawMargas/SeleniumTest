package org.example;

public class Main {

    int variable =  5;

    public static void main(String[] args){
        System.out.println("Hello Jonh !");
        var third = "aaa";
        var second = new Second();
        second.doPrint();
        System.out.println("Second " + second.number);
        second.setNumber(10);
        System.out.println("Second " + second.number);

        Beer beer = new Beer("Lech");
        second.drinkBeer(beer);
        System.out.println("Dringing in main " + beer);
    }
}
