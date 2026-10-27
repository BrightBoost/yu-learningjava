package com.pluralsight.famousquotesexample;

import java.util.Scanner;

public class FamousQuotesApp {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String[] quotes = new String[] {
                "Keep learning.",
                "Small steps lead to big changes.",
                "Believe in your ability to grow.",
                "Every day is a new chance.",
                "Practice makes progress.",
                "Be kind to yourself.",
                "Mistakes help you learn.",
                "Stay curious.",
                "You can do hard things.",
                "Keep moving forward."
        };

        showQuotes(quotes);
    }

    public static void showQuotes(String[] quotes) {

        boolean anotherQuote = true;

        while(anotherQuote) {
            System.out.println("Enter a number between 1 and " + quotes.length);
            try {
                int chosenNr = scanner.nextInt();
                scanner.nextLine();
                int index = chosenNr - 1;
                System.out.println(quotes[index]);
            } catch(Exception e) {
                System.out.println("Oh oh. Please make sure to enter nr between 1 and " + quotes.length);
            }
            System.out.println("Do you want to see another quote? yes / no");
            anotherQuote = scanner.nextLine().equals("yes");
        }
    }


}
