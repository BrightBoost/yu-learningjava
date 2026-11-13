package com.pluralsight;

import java.util.regex.Pattern;

public class NameFormatter {
    public static String format(String firstName, String lastName) {
        return lastName + ", " + firstName;
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
        return lastName + ", " + prefix + " " + firstName + " " + middleName + ", " + suffix;
    }

    public static String format(String firstName, String middleName, String lastName, String suffix) {
        return lastName + ", " + firstName + " " + middleName + ", " + suffix;
    }

    public static String format(String fullName) {
        fullName = fullName.replace(",", "");
        String[] fullNameParts = fullName.split(Pattern.quote(" "));
        String formattedName = switch(fullNameParts.length) {
            case 5 -> format(fullNameParts[0], fullNameParts[1], fullNameParts[2], fullNameParts[3], fullNameParts[4]);
            case 4 -> format(fullNameParts[0], fullNameParts[1], fullNameParts[2], fullNameParts[3]);
            case 2 -> format(fullNameParts[0], fullNameParts[1]);
            default -> throw new RuntimeException("format not supported");
        };
        return formattedName;
    }
}
