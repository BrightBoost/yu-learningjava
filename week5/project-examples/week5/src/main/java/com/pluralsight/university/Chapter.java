package com.pluralsight.university;

public class Chapter {
    private int nr;
    private String title;

    public Chapter(int nr, String title) {
        this.nr = nr;
        this.title = title;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
