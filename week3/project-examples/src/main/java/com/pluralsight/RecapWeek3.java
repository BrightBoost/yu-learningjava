package com.pluralsight;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;

public class RecapWeek3 {
    public static void main(String[] args) {

    }
    // reading from file
    public static void readFromFile(String fileName) {
        try {
            // step 1 create filereader
            FileReader fr = new FileReader(fileName);
            // step 2 use fileReader to create bufferedreader
            BufferedReader br = new BufferedReader(fr);
            // step 3 read
            String line;
            while((line = br.readLine()) != null) {

                System.out.println(line);
            }
            // step 4 close reader
            br.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    // writing to a file
    public static void writeToFile(String fileName) {
        try {
            // step 1 create filewriter
            FileWriter fw = new FileWriter(fileName);
            // step 2 use filewriter to create bufferedwriter
            BufferedWriter bw = new BufferedWriter(fw);
            // step 3 write
            bw.write("HELLO!");
            // step 4 close writer
            bw.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    // dates
    public static void showingDates() {
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        System.out.println(ldt.format(dtf));
    }

    // lists
    public static void createList() {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("mango");
        fruits.add("watermelon");
        fruits.add("apples");
        fruits.add("pineapple");
        fruits.add("strawberry");
        fruits.add("mineola");
        fruits.add("plum");
        fruits.add("banana");

        for(int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        fruits.remove("banana");
    }
    // maps
    public static void createMap() {
        HashMap<String, Integer> namesAndAges = new HashMap<>();
        namesAndAges.put("Gaia", 11);
        namesAndAges.put("Jonas", 8);
        namesAndAges.put("Zia", 3);

        namesAndAges.remove("Zia");

        for(String name : namesAndAges.keySet()) {
            System.out.println(name + " : " + namesAndAges.get(name));
        }
    }
}
