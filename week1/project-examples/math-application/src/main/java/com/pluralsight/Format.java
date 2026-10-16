package com.pluralsight;

public class Format {
    public static void main(String[] args) {
        String formattedName = formatName("Maaike", "van Putten");
        System.out.println(formattedName);
    }

    public static String formatName(String first, String last) {
        return last + ", " + first;
    }
}
