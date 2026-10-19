package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = scanner.nextLine().trim();

        String[] nameParts = name.split(Pattern.quote(" "));

        if(nameParts.length == 3) {
            System.out.println("First name: " + nameParts[0]);
            System.out.println("Middle name: " + nameParts[1]);
            System.out.println("Last name: " + nameParts[2]);
        } else if(nameParts.length == 2) {
            System.out.println("First name: " + nameParts[0]);
            System.out.println("Last name: " + nameParts[1]);
        }


    }
}
