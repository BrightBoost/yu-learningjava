package com.pluralsight;


import java.util.Scanner;

public class RentalCar {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // get all the data
        System.out.println("How many days would you like the car?");
        int nrOfDays = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Do you want toll tag for 3.95 (yes/no)?");
        boolean tollTag = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.println("Do you want GPS for 2.95 (yes/no)?");
        boolean gps = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.println("Do you want roadside assistance for 3.95 (yes/no)?");
        boolean roadSideAssistance = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        double basicCarRentalRate = 29.99;

        double options = calculateOptions(tollTag, gps, roadSideAssistance);

        // add 30% if under 25
        double surcharge = calculateSurcharge(age, basicCarRentalRate, options);

        // calculate total
        double total = nrOfDays * (basicCarRentalRate + options + surcharge);

        // display
        displayReceipt(basicCarRentalRate, options, surcharge, total);
    }

    public static double calculateOptions(boolean tollTag, boolean gps, boolean roadSideAssistance) {
        // calculate options cost
        double options = 0;
        // add 3.95 if toll tag
        if(tollTag) {
            options += 3.95;
        }
        // add 2.95 if gps
        if(gps) {
            options += 2.95;
        }
        // add 3.95 if roadside
        if(roadSideAssistance) {
            options += 3.95;
        }

        return options;
    }

    public static double calculateSurcharge(int age, double basicCarRentalRate, double options) {
        double surcharge = 0;
        if(age < 25) {
            surcharge = (basicCarRentalRate + options) * 0.3;
        }
        return surcharge;
    }

    public static void displayReceipt(double basicCarRentalRate, double options, double surcharge, double total) {
        System.out.println("Basic car rental: " + basicCarRentalRate);
        System.out.println("Options: " + options);
        System.out.println("Underage driver surcharge: " + surcharge);
        System.out.println("Total: " + total);
    }

}
