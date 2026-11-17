package com.pluralsight.assets;

import java.math.BigDecimal;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        House house = new House("house in seattle", "Nov 17 2026", new BigDecimal("500000"), "12 main street", 3, 100, 100);
        Vehicle vehicle = new Vehicle("my car", "1 July 2025", new BigDecimal("20000"), "toyota yaris", 2020, 40000);

        List<Asset> assets = List.of(house, vehicle);

        for(Asset a : assets) {
            System.out.println(a);
        }

    }
}
