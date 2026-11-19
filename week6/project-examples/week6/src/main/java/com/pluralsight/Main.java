package com.pluralsight;


import com.pluralsight.oop.Boat;
import com.pluralsight.oop.Car;
import com.pluralsight.oop.Motorbike;
import com.pluralsight.oop.Vehicle;
import com.pluralsight.oopexercise.Moped;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Boat boat = new Boat(9);
        Boat boat1 = new Boat("bla", "bla", 1234, "blue", 1);

        Motorbike motorbike = new Motorbike("kawasaki", "ninja 400", 4455, "green");

        Car car = new Car("toyota", "yaris", 10000, "red");
        Car car1 = new Car("Honda", "civic", 30000, "green");
        Car car2 = new Car("Honda", "civic", 20000, "silver");

        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(boat);
        vehicleList.add(boat1);
        vehicleList.add(motorbike);
        vehicleList.add(car);
        vehicleList.add(car1);
        vehicleList.add(car2);

        Car someVehicle = (Car) vehicleList.get(0);






    }
}
