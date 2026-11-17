package com.pluralsight.oopexercise;


import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Moped moped = new Moped("pink", 2, 5, 4, true);
        Car car = new Car("pink", 5, 50, 40);
        Vehicle aVehicle = new Moped("pink", 3, 5, 4, true);

        List<Vehicle> vehicleList = List.of(moped, car, aVehicle);

        for(Vehicle v : vehicleList) {
            if(v instanceof Car c) {
                c.doCarStuff();
            }
            v.makeWarningSound();
            System.out.println(v.getClass().getSimpleName());
        }

    }
}
