package com.pluralsight;

import java.util.Scanner;

public class Questions {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Who are you? ");

        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        System.out.println("How old are you?");
        int age2 = Integer.parseInt(scanner.nextLine());
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("You are " + age + " years old");

        System.out.println("What's your favorite floating point number? ");
        double favoriteNumber = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Your favorite number is " + favoriteNumber);

        System.out.println("What's your favorite color? ");
        String favoriteColor = scanner.nextLine();
        System.out.println("Your favorite color is " + favoriteColor);
    }
}
