package com.pluralsight;

import java.util.regex.Pattern;

public class ParsingExamples {
    public static void main(String[] args) {
        String input = "111|Hot Chocolate (12-count)|21|4.99";
        String input2 = "111/Hot Chocolate (12-count)/21/4.99";
        displayOrder(input2, "/");
        displayOrder("112|Coffee (12-count)|100|4.99", "|");
    }

    public static void displayOrder(String input, String separator) {
        String[] tokens = input.split(Pattern.quote(separator));

        int id = Integer.parseInt(tokens[0]);
        String description = tokens[1];
        int quantity = Integer.parseInt(tokens[2]);
        double price = Double.parseDouble(tokens[3]);

        double totalPrice = price * quantity;

        System.out.println("*******************************");
        System.out.println("Description: " + description);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Total price: " + totalPrice);
        System.out.println("*******************************");
    }
}
