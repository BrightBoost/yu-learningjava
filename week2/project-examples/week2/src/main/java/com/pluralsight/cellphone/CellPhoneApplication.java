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

        display(cellPhone);

        // second phone
        CellPhone cellPhone2 = new CellPhone();
        cellPhone2.setOwner("Richaun");
        cellPhone2.setSerialNumber("1234");
        cellPhone2.setModel("iphone");
        cellPhone2.setCarrier("t mobile");
        cellPhone2.setPhoneNumber("123-234-345");

        display(cellPhone2);

        cellPhone.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone.getPhoneNumber());

        CellPhone cellPhone3 = new CellPhone("123123", "samsung", "tmobile","123-123-123", "maaike");
        display(cellPhone3);

        cellPhone.dial(cellPhone3.getPhoneNumber());
    }

    public static void display(CellPhone cellPhone) {
        System.out.println("Cellphone data:");
        System.out.println("Serial number: " + cellPhone.getSerialNumber());
        System.out.println("Model: " + cellPhone.getModel());
        System.out.println("Carrier: " + cellPhone.getCarrier());
        System.out.println("Phone number: " + cellPhone.getPhoneNumber());
        System.out.println("Owner: " + cellPhone.getOwner());
    }
}
