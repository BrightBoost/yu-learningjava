package com.pluralsight.hotel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void checkIn_availableRoom() {
        // arrange
        Room room = new Room();

        // act
        boolean checkIn = room.checkIn();

        // assert
        assertTrue(checkIn);
        assertTrue(room.isDirty());
        assertTrue(room.isOccupied());
        assertFalse(room.isAvailable());
    }

    @Test
    void checkIn_dirtyAndOccupiedRoom() {
        // arrange
        Room room = new Room();
        room.checkIn();

        // act
        boolean checkIn = room.checkIn();

        // assert
        assertFalse(checkIn);
    }

    @Test
    void checkOut() {
        // arrange
        Room room = new Room();
        room.checkIn();

        // act
       room.checkOut();

        // assert
        assertFalse(room.isDirty());
        assertFalse(room.isOccupied());
        assertTrue(room.isAvailable());
    }

    @Test
    void cleanRoom() {
        // arrange
        Room room = new Room();
        room.checkIn();

        // act
        room.cleanRoom();

        // assert
        assertFalse(room.isDirty());
    }
}