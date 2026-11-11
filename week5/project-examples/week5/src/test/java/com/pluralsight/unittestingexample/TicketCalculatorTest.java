package com.pluralsight.unittestingexample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketCalculatorTest {

    private TicketCalculator ticketCalculator;

    @BeforeEach
    void init() {
        ticketCalculator = new TicketCalculator();
    }

    @Test
    void calculatePriceForUnder12() {
        // arrange
        int age = 6;
        double expected = 5;

        // act
        double price = ticketCalculator.calculatePrice(age);

        // assert
        assertEquals(expected, price);
    }

    @Test
    void calculatePriceForOver12() {
        // arrange
        int age = 26;
        double expected = 10;

        // act
        double price = ticketCalculator.calculatePrice(age);

        // assert
        assertEquals(expected, price);
    }

    @Test
    void calculatePriceForAge12() {
        // arrange
        int age = 12;
        double expected = 10;

        // act
        double price = ticketCalculator.calculatePrice(age);

        // assert
        assertEquals(expected, price);
    }
}