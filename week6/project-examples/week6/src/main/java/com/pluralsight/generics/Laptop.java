package com.pluralsight.generics;

public class Laptop {
    private String make;
    private String model;
    private int releaseYear;

    public Laptop(String make, String model, int releaseYear) {
        this.make = make;
        this.model = model;
        this.releaseYear = releaseYear;
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

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
