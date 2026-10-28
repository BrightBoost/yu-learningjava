package com.pluralsight.inventory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class StoreApp {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventoryFromFile();

        boolean running = true;
        Scanner scanner = new Scanner(System.in);
        while(running) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    displayProducts(inventory);
                case 2:
                    System.out.println("What id are you looking for?");
                    int idOfProduct = scanner.nextInt();
                    scanner.nextLine();
                    Product foundProduct = findProductById(inventory, idOfProduct);
                    System.out.println(foundProduct);
                case 3:
                case 4:
                case 5:
                default:
                    System.out.println("Sorry I don't know that option!");
            }
        }





    }

    public static void displayProducts(ArrayList<Product> inventory) {
        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %d %s - Price: $%.2f%n",
                    p.getId(), p.getName(), p.getPrice());
        }
    }

    public static Product findProductById(ArrayList<Product> inventory, int id) {
        for(Product p : inventory) {
            if(p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();
        inventory.add(new Product(1, "Coffee mug", 10));
        inventory.add(new Product(2, "Keyboard", 100));
        inventory.add(new Product(3, "Pen", 1));
        inventory.add(new Product(4, "Book", 30));
        inventory.add(new Product(5, "Little duck", 2));
        return inventory;
    }

    public static ArrayList<Product> getInventoryFromFile() {
        ArrayList<Product> inventory = new ArrayList<Product>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("inventory.csv"));
            String line;

            while((line = br.readLine()) != null) {
                String[] productParts = line.split("\\|");
                inventory.add(new Product(Integer.parseInt(productParts[0]), productParts[1], Double.parseDouble(productParts[2])));
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Oh oh:" + e.getMessage());
        }

        return inventory;
    }

    public static void displayMenu() {
        String menu = """
                What do you want to do?
                1- List all products
                2- Lookup a product by its id
                3- Find all products within a price range
                4- Add a new product
                5- Quit the application
                Enter command:
                """;
        System.out.println(menu);
    }

}