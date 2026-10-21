package com.pluralsight.loopingexercises;

public class DoWhileLoop {
    public static void main(String[] args) {
        int counter = 0;
        String text = "I love Java!";
        do {
            System.out.println(text);
            counter++;
        } while (counter < 5);
    }
}
