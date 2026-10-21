package com.pluralsight.loopingexercises;

public class Dice {
    private int minValue = 1;
    private int maxValue = 6;

    public int roll() {
        int randomNumber = (int)(Math.random() * (maxValue - minValue + 1)) + minValue;
        return randomNumber;
    }
}
