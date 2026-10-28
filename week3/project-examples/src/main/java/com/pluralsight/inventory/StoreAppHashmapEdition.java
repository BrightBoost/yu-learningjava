package com.pluralsight.inventory;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StoreAppHashmapEdition {
   private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<Integer, Product> inventory = getInventoryFromFile();

        boolean running = true;
        while(running) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    displayProducts(inventory);
                    break;
                case 2:
                    System.out.println("What id are you looking for?");
                    int idOfProduct = scanner.nextInt();
                    scanner.nextLine();
                    Product foundProduct = findProductById(inventory, idOfProduct);
                    System.out.println(foundProduct);
                    break;
                case 3:
                    System.out.println("What is the minimum price?");
                    double min = scanner.nextDouble();
                    System.out.println("What is the maximum price?");
                    double max = scanner.nextDouble();
                    scanner.nextLine();
                    HashMap<Integer, Product> productsInRange = findProductInPriceRange(inventory, min, max);
                    displayProducts(productsInRange);
                    break;
                case 4:
                    Product product = addProduct();
                    inventory.put(product.getId(), product);
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Sorry I don't know that option!");
                    break;
            }
        }
    }

    public static void displayProducts(HashMap<Integer, Product> inventory) {
        System.out.println("We carry the following inventory: ");
        for (Integer keyId : inventory.keySet()) {
            Product p = inventory.get(keyId);
            System.out.printf("id: %d %s - Price: $%.2f%n",
                    p.getId(), p.getName(), p.getPrice());
        }
    }

    public static Product addProduct() {
        System.out.println("What is the id?");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is the name?");
        String name = scanner.nextLine();
        System.out.println("What is the price?");
        double price = scanner.nextDouble();
        scanner.nextLine();

        Product newProduct = new Product(id, name, price);
        writeProductToFile(newProduct);
        return newProduct;
    }

    public static void writeProductToFile(Product product) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("inventory.csv", true));
            bw.write(product.toFileString());
            bw.close();
        } catch (IOException e) {
            System.out.println("Oh oh: " + e.getMessage());
        }
    }

    public static Product findProductById(HashMap<Integer, Product> inventory, int id) {
        return inventory.get(id);
    }

    public static HashMap<Integer, Product> findProductInPriceRange(HashMap<Integer, Product> inventory, double min, double max) {
        HashMap<Integer, Product> productsInRange = new HashMap<>();
        for(Product p : inventory.values()) {
            if(p.getPrice() > min && p.getPrice() < max) {
                productsInRange.put(p.getId(), p);
            }
        }
        return productsInRange;
    }

    public static HashMap<Integer, Product> getInventory() {
        HashMap<Integer, Product> inventory = new HashMap<>();
        inventory.put(1, new Product(1, "Coffee mug", 10));
        inventory.put(2, new Product(2, "Keyboard", 100));
        inventory.put(3, new Product(3, "Pen", 1));
        inventory.put(4, new Product(4, "Book", 30));
        inventory.put(5, new Product(5, "Little duck", 2));
        return inventory;
    }

    public static HashMap<Integer, Product> getInventoryFromFile() {
        HashMap<Integer, Product> inventory = new HashMap<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("inventory.csv"));
            String line;

            while((line = br.readLine()) != null) {
                String[] productParts = line.split("\\|");
                inventory.put(Integer.parseInt(productParts[0]), new Product(Integer.parseInt(productParts[0]), productParts[1], Double.parseDouble(productParts[2])));
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