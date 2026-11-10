package com.pluralsight.university;

public class Course {
    private String title;
    private String courseNr;
    private String level;

    public Course(String title, String courseNr, String level) {
        this.title = title;
        this.courseNr = courseNr;
        this.level = level;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCourseNr() {
        return courseNr;
    }

    public void setCourseNr(String courseNr) {
        this.courseNr = courseNr;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
