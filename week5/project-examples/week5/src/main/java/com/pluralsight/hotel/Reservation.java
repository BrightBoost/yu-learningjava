package com.pluralsight.hotel;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean weekend;

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        double price = 124;
        if(roomType.equalsIgnoreCase("king")){
            price = 139;
        }
        if(isWeekend()) {
            price = price * 1.1;
        }
        return price;
    }


    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public double getReservationTotal() {
        return getPrice() * getNumberOfNights();
    }

}
