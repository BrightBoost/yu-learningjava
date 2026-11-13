package com.pluralsight.wednesdayrecap;

public class Coffee {
    private double ounces;
    private String coffeeType;

    public Coffee(double ounces, String coffeeType) {
        this.ounces = ounces;
        this.coffeeType = coffeeType;
    }

    public double getOunces() {
        return ounces;
    }

    public void setOunces(double ounces) {
        this.ounces = ounces;
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(String coffeeType) {
        this.coffeeType = coffeeType;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "ounces=" + ounces +
                ", coffeeType='" + coffeeType + '\'' +
                '}';
    }
}
