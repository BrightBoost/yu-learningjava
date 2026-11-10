package com.pluralsight.university;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        University university = new University("Radboud university");
        Book book1 = new Book("b1", new ArrayList<>(), new ArrayList<>(), "92837498234", 300);
        Book book2;
        book2 = new Book("b1", new ArrayList<>(), new ArrayList<>(), "92837498234", 300);
        Book book3 = new Book("b1", new ArrayList<>(), new ArrayList<>(), "92837498234", 300);

        List<Book> books = List.of(book1, book2, book3);

        Library library = new Library(university, books);
    }
}
