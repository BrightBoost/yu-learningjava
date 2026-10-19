package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateParsingExamples {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-dd-MM-yyyy");
        System.out.println(dtf.format(localDate));

        String dateString = "2026-09-13";
        LocalDate localDate1 = LocalDate.parse(dateString);
        System.out.println(dtf.format(localDate1));

        String dateString2 = "13-09-2026";
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate parsedLocalDate = LocalDate.parse(dateString2, dtf2);
        System.out.println(parsedLocalDate);
        System.out.println(dtf.format(parsedLocalDate));

    }
}
