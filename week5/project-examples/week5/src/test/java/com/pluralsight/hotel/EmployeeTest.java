package com.pluralsight.hotel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void punchIn() {
        // arrange
        Employee e = new Employee();
        int expectedHour = 10;
        int punchInHour = 10;

        // act
        e.punchIn(punchInHour);

        // assert
        assertEquals(expectedHour, e.getStartedAt());
    }

    @Test
    void punchOut() {
        // arrange
        Employee e = new Employee();
        int punchOutHour = 12;
        int punchInHour = 10;
        e.punchIn(punchInHour);
        int expectedHoursWorked = 2;

        // act
        e.punchOut(punchOutHour);

        // assert
        assertEquals(expectedHoursWorked, e.getHoursWorked());
    }
}