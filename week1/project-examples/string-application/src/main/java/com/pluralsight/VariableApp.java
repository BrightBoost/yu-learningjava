package com.pluralsight;

public class VariableApp {
    public static void main() {
        // Question 1:
        // declare variables here
        String favoriteColor;
        int yearStartedThisClass;
        String middleInitial;
        boolean petOwner;
        String niceMessage;

        short nrOfDaysInWeek = 7;
        double priceForCoffee = 4.99;
        char favoriteLetter = 'R';
        boolean raining = false;

        System.out.println("The week has " + nrOfDaysInWeek + " days.");
        System.out.println("The price for coffee is $" + priceForCoffee);
        System.out.println("My favorite letter is " + favoriteLetter);
        System.out.println("Is it raining? " + raining);

        System.out.println(nrOfDaysInWeek + priceForCoffee + favoriteLetter);
        System.out.println(nrOfDaysInWeek + priceForCoffee + "R");
        System.out.println("R" + nrOfDaysInWeek + priceForCoffee);
        System.out.println(" " + nrOfDaysInWeek + priceForCoffee + favoriteLetter);
        System.out.println(3 + 5 + "-" + 12 + 1);

        // then code solution
        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        // REPEAT FOR NEXT EXERCISE
    }
}
