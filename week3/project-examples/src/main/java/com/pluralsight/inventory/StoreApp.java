package com.pluralsight.inventory;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class StoreApp {
   private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventoryFromFile();

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
                    ArrayList<Product> productsInRange = findProductInPriceRange(inventory, min, max);
                    displayProducts(productsInRange);
                    break;
                case 4:
                    inventory.add(addProduct());
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

    public static void displayProducts(ArrayList<Product> inventory) {
        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
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

    public static Product findProductById(ArrayList<Product> inventory, int id) {
        for(Product p : inventory) {
            if(p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public static ArrayList<Product> findProductInPriceRange(ArrayList<Product> inventory, double min, double max) {
        ArrayList<Product> productsInRange = new ArrayList<>();
        for(Product p : inventory) {
            if(p.getPrice() > min && p.getPrice() < max) {
                productsInRange.add(p);
            }
        }
        return productsInRange;
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