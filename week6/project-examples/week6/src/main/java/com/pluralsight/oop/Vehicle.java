package com.pluralsight.oop;

public class Vehicle {
    private String make;
    private String model;
    private int odometer;
    private String color;

    public Vehicle() {
        super();
    }

    public Vehicle(String make, String model, int odometer, String color) {
        this.make = make;
        this.model = model;
        this.odometer = odometer;
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
