package com.pluralsight;

import java.util.Scanner;

public class Recap {
    public static void main(String[] args) {
        // primitive types
        int x = 2;
        double d = 4.5;
        boolean b = true;
        char c = 'a';
        short s = 1;
        byte b1 = 40;
        long l = 3234234234234234L;
        float f = 3.4f;
        // ^ all primitive types start with a lowercase letter for the type

        // non-primitive types << object types
        String str = "hello!";
        Scanner scanner = new Scanner(System.in);
        String[] arr = {"hi", "hello"};
        System.out.println(arr[0]);

        String bla; // declaration or declaring a variable
        bla = "lala"; // initialization or initializing a variable (but also assigning a value)

        String blabla = "lalala"; // declaration and initialization

        blabla = blabla.toUpperCase();
        System.out.println(blabla);

        if(blabla.equals(bla)) {

        }

        System.out.println("blabla" + 12 + 3);
        System.out.println(12 + 3 + "blabla");
        System.out.println(12 + 3 * 2 + "blabla");

        int nr1 = 10;
        long nr2 = 20;
        // narrowing
        nr1 = (int) nr2; // casting a long to an int


        // for
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // while
        int i = 0;
        while(i != 10) {
            System.out.println(i++);
        }

        // do while
        do {
            System.out.println(i++);
        } while(i < 100);

        // foreach



    }
}
