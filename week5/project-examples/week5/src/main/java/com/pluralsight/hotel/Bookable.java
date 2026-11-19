package com.pluralsight.hotel;

public interface Bookable {
    boolean book(String name);
    boolean cancel(String bookingNr);
}
