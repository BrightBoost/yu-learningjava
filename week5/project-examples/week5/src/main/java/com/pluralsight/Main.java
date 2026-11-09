package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("volkswagen", "beetle", 40, "pink");
        Car car2 = new Car("Mercedes", "benz", 100, "white");
        Car car3 = new Car("Toyota", "Prius", 80, "purple");

        car.start();
        car.drive("Nimcaan");
        car.stop();

        car3.start();
        car3.drive("Nebiyu");
        car3.stop();
    }
}
