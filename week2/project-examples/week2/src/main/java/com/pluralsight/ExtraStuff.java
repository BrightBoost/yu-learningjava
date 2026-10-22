package com.pluralsight;

public class ExtraStuff {
    public static void main(String[] args) {

        int[] grades = {88, 99, 100, 100, 65, 70};
        int sum = 0;

        for(int grade : grades) {
            sum += grade;
        }

        System.out.println("Avg grade: " + (sum / grades.length));



        String[] strings = new String[10];
        for(int i = 0; i < strings.length; i++) {
            System.out.println(strings[i] + "blabla");
            strings[i] = "lalala";
        }
    }
}
