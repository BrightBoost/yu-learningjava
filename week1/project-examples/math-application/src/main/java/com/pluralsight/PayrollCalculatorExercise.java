package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculatorExercise {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String name = getName();
        double hoursWorked = getHours();
        double payRate = getPayRate();

        System.out.println(name + "'s salary is " + hoursWorked * payRate);
    }

    public static String getName() {
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        return name;
    }

    public static double getHours() {
        System.out.println("How many hours did you work?");
        double hoursWorked = scanner.nextDouble();
        scanner.nextLine();
        return hoursWorked;
    }

    public static double getPayRate() {
        System.out.println("What's your payrate?");
        double payRate = scanner.nextDouble();
        scanner.nextLine();
        return payRate;
    }
}
