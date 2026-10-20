package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sbAdresses = new StringBuilder();

        // prompt the user
        // while doing so, build the string using stringbuilder
        System.out.println("Please provide the following information:");
        System.out.print("Full name: ");
        String fullName = scanner.nextLine();
        sbAdresses.append(fullName);

        sbAdresses.append("\nBilling Address:" + "\n");

        System.out.print("Billing street: ");
        sbAdresses.append(scanner.nextLine() + "\n");
        System.out.print("Billing city: ");
        sbAdresses.append(scanner.nextLine());
        sbAdresses.append(", ");

        System.out.print("Billing state: ");
        sbAdresses.append(scanner.nextLine());

        System.out.print("Billing zip: ");
        sbAdresses.append(scanner.nextLine());

        sbAdresses.append("\n\nShipping Address:"  + "\n");
        System.out.print("Shipping street: ");
        sbAdresses.append(scanner.nextLine()  + "\n");

        System.out.print("Shipping city: ");
        sbAdresses.append(scanner.nextLine());
        sbAdresses.append(", ");

        System.out.print("Shipping state: ");
        sbAdresses.append(scanner.nextLine());

        System.out.print("Shipping zip: ");
        sbAdresses.append(scanner.nextLine());


        // display the information
        System.out.println(sbAdresses.toString());
    }
}
