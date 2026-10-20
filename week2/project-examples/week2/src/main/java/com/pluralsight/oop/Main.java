package com.pluralsight.oop;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("grey", "Max", 30, "labradoodle");
//        dog1.setName("Max");
//        dog1.setWeight(30);
//        dog1.setBreed("labradoodle");
//        dog1.setFurColor("grey");

        Dog dog2 = new Dog();
        dog2.setBreed("corgi");
        dog2.setWeight(30);
        dog2.setName("Zahra");
        dog2.setFurColor("white and brown");

        dog1.bark();
        dog2.bark();
    }
}
