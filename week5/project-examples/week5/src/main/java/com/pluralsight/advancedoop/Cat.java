package com.pluralsight.advancedoop;

public class Cat extends Animal implements Pettable {
    @Override
    public void pet() {
        System.out.println("cat says purrrr");
    }
}
