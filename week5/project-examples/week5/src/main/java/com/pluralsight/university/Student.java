package com.pluralsight.university;

import java.util.List;

public class Student {
    private String name;
    private String program;
    private List<Course> courses;
    private List<Grade> grades;
    private University university;

    public Student(String name, String program, List<Course> courses, List<Grade> grades, University university) {
        this.name = name;
        this.program = program;
        this.courses = courses;
        this.grades = grades;
        this.university = university;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }
}
