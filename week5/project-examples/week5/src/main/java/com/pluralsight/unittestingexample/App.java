package com.pluralsight.unittestingexample;

public class App {
    public static void main(String[] args) {
        TicketCalculator tc = new TicketCalculator();
        System.out.println(tc.calculatePrice(5));
        System.out.println(tc.calculatePrice(15));
        System.out.println(tc.calculatePrice(12));
    }
}
