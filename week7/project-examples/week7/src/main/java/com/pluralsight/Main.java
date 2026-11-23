package com.pluralsight;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // anonymous implementation
        Calculator calculator = new Calculator() {
            @Override
            public double calc(double a, double b) {
                return a - b;
            }
        };

        System.out.println(calculator.calc(8, 2));

        // lambda expression
        Calculator c1 = (x, y) -> x - y;
        Tester t1 = (s) -> s.length() > 10;

        System.out.println(t1.test("blablabla"));
        System.out.println(t1.test("blablablabla"));

    }


}
