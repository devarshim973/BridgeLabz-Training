package com.Inheritance.multilevel;

public class StudyCourse {
    String courseName;
    int duration; // in hours

    public StudyCourse(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Display basic course info
    void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}