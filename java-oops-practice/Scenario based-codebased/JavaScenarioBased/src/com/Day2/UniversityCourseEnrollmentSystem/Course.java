package com.Day2.UniversityCourseEnrollmentSystem;

public class Course {
    private String courseCode;
    private String courseTitle;
    private int credits;

    public Course(String courseCode, String courseTitle, int credits) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.credits = credits;
    }

    public int getCredits() {
        return credits;
    }

    public void displayCourseInfo() {
        System.out.println(courseCode + " - " + courseTitle +
                " (" + credits + " Credits)");
    }
}
