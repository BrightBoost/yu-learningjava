package com.pluralsight;

public class Examples {
    public static void main() {
        int id = 10135;
        String name = "Brandon Plyers";
        float pay = 5239;
        System.out.printf("%s (id: %d) $%.2f", name, id, pay);

        if (id > 0) {
            System.out.println("blabla");
        }

        int age = 17;
        double price;
        if (age < 18) {
            price = 22.50;
        } else {
            price = 25.00;
        }
        System.out.println("Price of admission: " + price);

    }
}
