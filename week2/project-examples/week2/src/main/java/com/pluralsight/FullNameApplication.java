package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your first name?");
        String firstName = scanner.nextLine().trim();
        System.out.println("What's your middle name?");
        String middleName = scanner.nextLine().trim();
        System.out.println("What's your last name?");
        String lastName = scanner.nextLine().trim();
        System.out.println("What's your suffix?");
        String suffix = scanner.nextLine().trim();

        String fullName = firstName;

        if(!middleName.isEmpty()) {
            fullName += " " + middleName;
        }
        fullName += " " + lastName;

        if(!suffix.isEmpty()) {
            fullName += ", " + suffix;
        }

        System.out.println("Full name: " + fullName);
    }
}
