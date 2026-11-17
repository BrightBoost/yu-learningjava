package com.pluralsight.oopexercise;

public class Car extends Vehicle {
    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }

    public void doCarStuff() {
        System.out.println("I'm a car!");
    }
}
