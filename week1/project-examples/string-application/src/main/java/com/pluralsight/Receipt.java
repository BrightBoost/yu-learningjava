package com.pluralsight;

public class Receipt {
    public static void main() {
        String itemName = "coffee mug";
        double price = 12.99;
        int quantity = 4;
        System.out.println("You bought" + quantity + " " + itemName + "(s) for " + price * quantity);
    }
}
