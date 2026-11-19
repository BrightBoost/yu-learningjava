package com.pluralsight.advancedoop;

public class Dog extends Animal implements Pettable {
    @Override
    public void pet() {
        System.out.println("dog says woof");
    }
}
