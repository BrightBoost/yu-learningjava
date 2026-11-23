package com.pluralsight.dataprocessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Person p1 = new Person("Bla1", "La1", 20);
        Person p2 = new Person("Bla2", "La2", 20);
        Person p3 = new Person("Bla3", "La3", 21);
        Person p4 = new Person("Bla4", "La4", 21);
        Person p5 = new Person("Blabla5", "L5", 22);
        Person p6 = new Person("Bla6", "La6", 22);
        Person p7 = new Person("Bla7", "La7", 23);
        Person p8 = new Person("Bla8", "Lala8", 24);
        Person p9 = new Person("Bla9", "La9", 25);
        Person p10 = new Person("Bla10", "La10", 29);

        List<Person> people = List.of(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);

        searchByName(people);
        calculateAverageAge(people);
        findOldestAge(people);
        findYoungestAge(people);

    }

    public static void searchByName(List<Person> people) {
        System.out.println("What name do you want to search for?");
        String search = scanner.nextLine();

        List<Person> matches = new ArrayList<>();

        for(Person p : people) {
            if(p.getFirstName().contains(search) || p.getLastName().contains(search)) {
                matches.add(p);
            }
        }

        printPeople(matches);

    }

    public static void printPeople(List<Person> people) {
        for(Person p : people) {
            System.out.println(p);
        }
    }

    public static void calculateAverageAge(List<Person> people) {
        int sum = 0;
        for(Person p : people) {
            sum += p.getAge();
        }

        System.out.println((double) sum / people.size());
    }

    public static void findOldestAge(List<Person> people) {
        int oldest = people.get(0).getAge();
        for(Person p : people) {
            if(oldest < p.getAge()) {
                oldest = p.getAge();
            }
        }

        System.out.println(oldest);
    }

    public static void findYoungestAge(List<Person> people) {
        int youngest = people.get(0).getAge();
        for(Person p : people) {
            if(youngest > p.getAge()) {
                youngest = p.getAge();
            }
        }

        System.out.println(youngest);
    }
}
