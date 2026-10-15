package com.pluralsight;

import java.util.Scanner;

public class ExampleForMethods2 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main() {
        System.out.println("What do you want to calculate today?");
        System.out.println("1) Area of a circle");
        System.out.println("2) Area of a rectangle");
        System.out.println("3) Payroll calculator");

        int choice = scanner.nextInt();

        if (choice == 1) {
            calculateAreaCircle();
        } else if (choice == 2) {
            calculateAreaRectangle();
        } else if (choice == 3) {
           calculateSalary();
        }
    }

    public static void calculateAreaCircle() {
        System.out.println("You chose to calculate the area of a circle");
        System.out.println("What is the radius?");
        double radius = scanner.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is " + area);
    }

    public static void calculateAreaRectangle() {
        System.out.println("You chose to calculate the area of a rectangle");
        System.out.println("What is the length of side A?");
        double lengthA = scanner.nextDouble();
        System.out.println("What is the length of side B?");
        double lengthB = scanner.nextDouble();
        double area = lengthA * lengthB;
        System.out.println("The area of the rectangle is " + area);
    }

    public static void calculateSalary() {
        System.out.println("You chose to calculate payroll");
        System.out.println("How many hours did you work?");
        double hours = scanner.nextDouble();
        System.out.println("What's the hourly rate?");
        double rate = scanner.nextDouble();
        System.out.println("Your salary is " + hours * rate);
    }
}
