package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {

    @Test
    void format_twoParts() {
        // arrange
        String fullName = "Maaike Vanputten";
        String expectedResult = "Vanputten, Maaike";

        // act
        String result = NameFormatter.format(fullName);

        // assert
        assertEquals(expectedResult, result);
    }

    @Test
    void format_fourParts() {
        // arrange
        String fullName = "Mel B Johnson, PhD";
        String expectedResult = "Johnson, Mel B, PhD";

        // act
        String result = NameFormatter.format(fullName);

        // assert
        assertEquals(expectedResult, result);
    }

    @Test
    void format_fiveParts() {
        // arrange
        String fullName = "Dr. Mel B Johnson, PhD";
        String expectedResult = "Johnson, Dr. Mel B, PhD";

        // act
        String result = NameFormatter.format(fullName);

        // assert
        assertEquals(expectedResult, result);
    }

}