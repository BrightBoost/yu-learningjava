package com.pluralsight;

public class Bicycle {
    private int size;
    private String make;
    private boolean electrical;
    private double price;

    public Bicycle(int size, String make, boolean electrical, double price) {
        this.size = size;
        this.make = make;
        this.electrical = electrical;
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public boolean isElectrical() {
        return electrical;
    }

    public void setElectrical(boolean electrical) {
        this.electrical = electrical;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void ringBell() {
        System.out.println("tring");
    }


}
