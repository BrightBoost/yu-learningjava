package com.pluralsight.oop;

public class Car extends Vehicle {
    public Car() {

    }

    public Car(String make, String model, int odometer, String color) {
        super(make, model, odometer, color);
    }

    public void whipeWindow() {
        System.out.println("woosh woosh");
    }


}
