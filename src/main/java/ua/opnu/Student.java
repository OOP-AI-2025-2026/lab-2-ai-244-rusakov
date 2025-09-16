package ua.opnu;

import java.util.ArrayList;

public class Student {
    private String name;
    private int year;
    private ArrayList<String> courses;

    public Student(String name, int year) {
        if (year < 1 || year > 4) {
            throw new IllegalArgumentException("Year must be from 1 to 4");
        }

        this.name = name;
        this.year = year;
        this.courses = new ArrayList<>();
    }

    public void addCourse(String courseName) {
        if (courseName != null && !courseName.isBlank()) {
            courses.add(courseName);
        }
    }

    public void dropAll() {
        courses.clear();
    }

    public int getCourseCount() {
        return courses.size();
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getTuition() {
        return year * 20000;
    }
}
