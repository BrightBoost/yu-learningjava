package com.pluralsight.university;

import java.util.List;

public class Professor {
    private String name;
    private String field;
    private List<Course> courses;

    public Professor(String name, String field, List<Course> courses) {
        this.name = name;
        this.field = field;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
