package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // prompt for name
        System.out.println("What's your name?");
        String name = scanner.nextLine();

        // prompt for date in format MM/dd/yyyy
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println("What date will you be coming? (MM/dd/yyyy)");
        String stringDate = scanner.nextLine();
        LocalDate dateTheater = LocalDate.parse(stringDate, dtf);

        // prompt for nr of tickets
        System.out.println("How many tickets would you like?");
        int nrOfTickets = Integer.parseInt(scanner.nextLine());

        // format the name
        String formattedName = formatName(name);

        // format the date
        DateTimeFormatter dtfPrint = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String printDate = dateTheater.format(dtfPrint);

        // decide on ticket or tickets
        String ticketText = "ticket";

        if(nrOfTickets > 1) {
            ticketText += "s";
        }

        // print the message
        System.out.println(nrOfTickets + " " + ticketText + " reserved for " + printDate + " under " + formattedName);
    }

    public static String formatName(String name) {
        String[] nameParts = name.split(Pattern.quote(" "));

        return nameParts[1] + ", " + nameParts[0];

    }
}
