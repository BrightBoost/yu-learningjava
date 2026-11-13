package com.pluralsight.wednesdayrecap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeMachineTest {
    private  CoffeeMachine coffeeMachine;

    @BeforeEach
    void init() {
        List<String> coffeeTypes = List.of("espresso", "regular");
        coffeeMachine = new CoffeeMachine("philips", coffeeTypes, 300);
    }

    @Test
    void makeCoffee_supportedType() {
        // arrange
        String chosenType = "regular";

        // act
        Coffee coffee = coffeeMachine.makeCoffee(chosenType);

        // assert
        assertNotNull(coffee);
        assertEquals(chosenType, coffee.getCoffeeType());
    }

    @Test
    void makeCoffee_supportedType_ouncesSpecified() {
        // arrange
        String chosenType = "regular";
        int chosenOunces = 5;

        // act
        Coffee coffee = coffeeMachine.makeCoffee(chosenOunces, chosenType);

        // assert
        assertNotNull(coffee);
        assertEquals(chosenType, coffee.getCoffeeType());
        assertEquals(chosenOunces, coffee.getOunces());
    }
}