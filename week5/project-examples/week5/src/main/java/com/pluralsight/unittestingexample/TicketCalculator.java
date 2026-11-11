package com.pluralsight.unittestingexample;

public class TicketCalculator {
    // everyone under 12 pays 5, others pay 10
    public double calculatePrice(int age) {
        if(age < 12) {
            return 5;
        }
        return 10;
    }
}
