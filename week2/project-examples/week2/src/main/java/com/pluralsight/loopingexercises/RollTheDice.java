package com.pluralsight.loopingexercises;

import java.sql.SQLOutput;

public class RollTheDice {
    public static void main(String[] args) {
        Dice d1 = new Dice();
        Dice d2 = new Dice();

        DiceStats diceStats = new DiceStats();

        for(int i = 0; i < 100; i++) {
            int roll1 = d1.roll();
            int roll2 = d2.roll();
            int result = roll1 + roll2;
            diceStats.incrementCounter(result);

            System.out.println("Roll " + i + ": " + roll1 + " - " + roll2 + " Sum: " + result);
        }

        diceStats.printStats();
    }
}
