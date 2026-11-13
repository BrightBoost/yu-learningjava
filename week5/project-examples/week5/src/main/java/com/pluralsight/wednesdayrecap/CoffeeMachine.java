package com.pluralsight.wednesdayrecap;

import java.util.List;

public class CoffeeMachine {
    // data
    private String make;
    private List<String> coffeeTypes;
    private double price;

    public CoffeeMachine(String make, List<String> coffeeTypes, double price) {
        this.make = make;
        this.coffeeTypes = coffeeTypes;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public List<String> getCoffeeTypes() {
        return coffeeTypes;
    }

    public void setCoffeeTypes(List<String> coffeeTypes) {
        this.coffeeTypes = coffeeTypes;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // actions
    public Coffee makeCoffee(int ounces, String coffeeType) {
        if(coffeeTypes.contains(coffeeType)) {
            return new Coffee(ounces, coffeeType);
        }
        throw new RuntimeException("Coffeetype not supported: " + coffeeType);
    }

    public Coffee makeCoffee(String coffeeType) {
        if(coffeeTypes.contains(coffeeType)) {
            return new Coffee(2, coffeeType);
        }
        throw new RuntimeException("Coffeetype not supported: " + coffeeType);
    }
}
