package com.pluralsight.cellphone;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        // create a empty cellphone
        CellPhone cellPhone = new CellPhone();

        // create a scanner
        Scanner scanner = new Scanner(System.in);

        // prompt for the cellphone fields and set them
        System.out.println("What is the serial number?");
        cellPhone.setSerialNumber(scanner.nextLine());
        System.out.println("What is the phone model?");
        cellPhone.setModel(scanner.nextLine());
        System.out.println("Who is the carrier?");
        cellPhone.setCarrier(scanner.nextLine());
        System.out.println("What is the phone number?");
        cellPhone.setPhoneNumber(scanner.nextLine());
        System.out.println("Who is the phone owner?");
        cellPhone.setOwner(scanner.nextLine());

        // display cellphone data
        System.out.println("Cellphone data:");
        System.out.println("Serial number: " + cellPhone.getSerialNumber());
        System.out.println("Model: " + cellPhone.getModel());
        System.out.println("Carrier: " + cellPhone.getCarrier());
        System.out.println("Phone number: " + cellPhone.getPhoneNumber());
        System.out.println("Owner: " + cellPhone.getOwner());

    }
}
