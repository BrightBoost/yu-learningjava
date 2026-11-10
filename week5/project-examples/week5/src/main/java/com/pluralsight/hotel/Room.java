package com.pluralsight.hotel;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        return !dirty && !occupied;
    }

    public boolean checkIn() {
        if(isAvailable()) {
            occupied = true;
            dirty = true;
            return true;
        }
        return false;
    }

    public void checkOut() {
        occupied = false;
        cleanRoom();
    }

    public void cleanRoom() {
        dirty = false;
    }
}
