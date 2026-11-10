package com.pluralsight.university;

import java.util.List;

public class Library {
    private University university;
    private List<Book> books;

    public Library(University university, List<Book> books) {
        this.university = university;
        this.books = books;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
