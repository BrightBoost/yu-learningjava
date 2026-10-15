package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // Question 1:
        double bobSalary = 2000;
        double garySalary = 3000;
        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is " + highestSalary);

        // Question 2:
        double carPrice = 2000;
        double truckPrice = 3000;
        double lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest price is " + lowestPrice);

        // Question 3: pi * r^2
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The circle area for a circle with a radius of " + radius + " is " + area);


    }
}
