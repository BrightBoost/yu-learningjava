package com.pluralsight.oop;

public class Boat extends Vehicle {
    private int nrOfDecks;

    public Boat(int nrOfDecks) {
        this.nrOfDecks = nrOfDecks;
    }

    public Boat(String make, String model, int odometer, String color, int nrOfDecks) {
        super(make, model, odometer, color);
        this.nrOfDecks = nrOfDecks;
    }

    public int getNrOfDecks() {
        return nrOfDecks;
    }

    public void setNrOfDecks(int nrOfDecks) {
        this.nrOfDecks = nrOfDecks;
    }
}
