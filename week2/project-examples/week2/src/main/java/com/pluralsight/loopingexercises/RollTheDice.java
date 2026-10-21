package com.pluralsight.loopingexercises;

import java.sql.SQLOutput;

public class RollTheDice {
    public static void main(String[] args) {
        Dice d1 = new Dice();
        Dice d2 = new Dice();

        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        for(int i = 0; i < 100; i++) {
            int roll1 = d1.roll();
            int roll2 = d2.roll();
            int result = roll1 + roll2;
            if(result == 2) {
                twoCounter++;
            } else if(result == 4) {
                fourCounter++;
            } else if(result == 6) {
                sixCounter++;
            } else if(result == 7) {
                sevenCounter++;
            }
            System.out.println("Roll " + i + ": " + roll1 + " - " + roll2 + " Sum: " + result);
        }
        System.out.println("2s: " + twoCounter);
        System.out.println("4s: " + fourCounter);
        System.out.println("6s: " + sixCounter);
        System.out.println("7s: " + sevenCounter);
    }
}
