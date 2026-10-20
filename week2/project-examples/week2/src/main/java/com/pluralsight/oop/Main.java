package com.pluralsight.oop;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Max";
        dog1.weight = 30;
        dog1.breed = "labradoodle";
        dog1.furColor = "grey";

        Dog dog2 = new Dog();
        dog2.breed = "corgi";
        dog2.weight = 30;
        dog2.name = "Zahra";
        dog2.furColor = "white and brown";

        dog1.bark();
        dog2.bark();
    }
}
