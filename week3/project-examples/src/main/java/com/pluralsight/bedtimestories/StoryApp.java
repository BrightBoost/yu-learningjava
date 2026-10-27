package com.pluralsight.bedtimestories;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class StoryApp {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String[] stories = { "goldilocks.txt", "hansel_and_gretel.txt", "mary_had_a_little_lamb.txt"};

        for(int i = 0; i < stories.length; i++) {
            System.out.println((i + 1) + ": " + stories[i]);
        }
        System.out.println("Which story would you like to read? Enter the nr.");
        int choice = scanner.nextInt();

        try {
            FileReader fr = new FileReader("bedtimestories/" + stories[choice-1]);
            BufferedReader br = new BufferedReader(fr);

            String line;

            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
