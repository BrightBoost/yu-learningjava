package com.pluralsight.vehicleinventory;

import java.util.Scanner;

public class DealershipApp {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Vehicle(101121L, "Ford Explorer", "Red", 45000, 13500.00),
                new Vehicle(101122L, "Toyota Camry", "Blue", 60000, 11000.00),
                new Vehicle(101123L, "Chevrolet Malibu", "Black", 50000, 9700.00),
                new Vehicle(101124L, "Honda Civic", "White", 70000, 7500.00),
                new Vehicle(101125L, "Subaru Outback", "Green", 55000, 14500.00),
                new Vehicle(101126L, "Jeep Wrangler", "Yellow", 30000, 16000.00),
                null, null, null, null, null, null, null, null, null, null, null, null, null, null, null
        };

        boolean programRuns = true;
        while(programRuns) {
            int choice = getUserOption();

            switch(choice) {
                case 1:
                    listVehicles(vehicles);
                    break;
                case 2:
                    searchByMakeModel(vehicles);
                    break;
                case 3:
                    searchByPriceRange(vehicles);
                    break;
                case 4:
                    searchByColor(vehicles);
                    break;
                case 5:
                    addVehicle(vehicles);
                    break;
                case 6:
                    programRuns = false;
                    break;
                default:
                    System.out.println("Sorry I don't know that option.");
            }
        }

    }

    public static int getUserOption() {
        String text = """
                What do you want to do?
                1 - List all vehicles
                2 - Search by make/model
                3 - Search by price range
                4 - Search by color
                5 - Add a vehicle
                6 - Quit
                Enter your command:
                """;
        System.out.println(text);
        return Integer.parseInt(scanner.nextLine());
    }

    public static void listVehicles(Vehicle[] vehicles) {
        for(Vehicle vehicle : vehicles) {
            if(vehicle != null) {
                System.out.println(vehicle);
            }
        }
    }

    public static void searchByMakeModel(Vehicle[] vehicles) {
        System.out.println("What make or model are you looking for?");
        String makeModel = scanner.nextLine();
        for(Vehicle vehicle : vehicles) {
            if(vehicle != null && vehicle.getMakeModel().contains(makeModel)) {
                System.out.println(vehicle);
            }
        }
    }

    public static void searchByPriceRange(Vehicle[] vehicles) {
        System.out.println("What is the min price?");
        double minPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("What is the max price?");
        double maxPrice = Double.parseDouble(scanner.nextLine());
        for(Vehicle vehicle : vehicles) {
            if(vehicle != null && vehicle.getPrice() > minPrice && vehicle.getPrice() < maxPrice) {
                System.out.println(vehicle);
            }
        }
    }

    public static void searchByColor(Vehicle[] vehicles) {
        System.out.println("What color are you looking for?");
        String color = scanner.nextLine();
        for(Vehicle vehicle : vehicles) {
            if(vehicle != null && vehicle.getColor().contains(color)) {
                System.out.println(vehicle);
            }
        }
    }

    public static void addVehicle(Vehicle[] vehicles) {
        Vehicle vehicle = createVehicle();

        for(int i = 0; i < vehicles.length; i++) {
            if(vehicles[i] == null) {
                vehicles[i] = vehicle;
                break;
            }
        }
    }

    public static Vehicle createVehicle() {
        Vehicle vehicle = new Vehicle();

        System.out.println("What is the id?");
        long id = Long.parseLong(scanner.nextLine());
        vehicle.setVehicleId(id);

        System.out.println("What is the make model?");
        vehicle.setMakeModel(scanner.nextLine());

        System.out.println("What is the price?");
        vehicle.setPrice(Double.parseDouble(scanner.nextLine()));

        System.out.println("What is the color?");
        vehicle.setColor(scanner.nextLine());

        System.out.println("What is the odometerReading?");
        vehicle.setOdometerReading(Integer.parseInt(scanner.nextLine()));

        return vehicle;
    }
}
