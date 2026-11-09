package com.pluralsight;

public class Car {
    // data
    private String make;
    private String model;
    private int hp;
    private String color;
    private boolean running;

    public Car() {
    }

    public Car(String make, String model, int hp, String color) {
        this.make = make;
        this.model = model;
        this.hp = hp;
        this.color = color;
    }

    // getters and setters

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

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isRunning() {
        return running;
    }

    // do
    // start
    public void start() {
        running = true;
    }

    // drive
    public void drive() {
        if(running) {
            System.out.println(make + " " + model + " says: vroom vroom");
        } else {
            System.out.println("start engine first!");
        }
    }

    public void drive(String driverName) {
        System.out.println("Welcome " + driverName);
        drive();
    }

    // brake
    public void brake() {
        System.out.println("Car is stopping....");
    }

    // honk
    public void honk() {
        System.out.println("toot");
    }

    public void stop() {
        running = false;
    }


}
