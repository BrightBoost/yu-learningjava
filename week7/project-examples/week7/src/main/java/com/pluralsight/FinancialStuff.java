package com.pluralsight;

public class FinancialStuff implements Calculator {
    @Override
    public double calc(double a, double b) {
        return a - b;
    }
}
