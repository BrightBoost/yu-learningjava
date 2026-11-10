package com.pluralsight.university;

import java.util.List;

public class Book {
    private String title;
    private List<Chapter> chapters;
    private List<Author> authors;
    private String isbn;
    private int nrOfPages;

    public Book(String title, List<Chapter> chapters, List<Author> authors, String isbn, int nrOfPages) {
        this.title = title;
        this.chapters = chapters;
        this.authors = authors;
        this.isbn = isbn;
        this.nrOfPages = nrOfPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNrOfPages() {
        return nrOfPages;
    }

    public void setNrOfPages(int nrOfPages) {
        this.nrOfPages = nrOfPages;
    }
}
