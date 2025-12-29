package com.constructor;

public class Course {

    // Instance variables
    String courseName;
    int duration;       // duration in months
    double fee;

    // Class variable (shared by all courses)
    static String instituteName = "BridgeLabz";

    // Constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    void displayCourseDetails() {
        System.out.println("Institute Name : " + instituteName);
        System.out.println("Course Name    : " + courseName);
        System.out.println("Duration       : " + duration + " months");
        System.out.println("Fee            : " + fee);
        System.out.println("----------------------------");
    }

    // Class method to update institute name
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    // Main method
    public static void main(String[] args) {

        Course c1 = new Course("Java Full Stack", 6, 45000);
        Course c2 = new Course("Python Programming", 4, 30000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        // Updating institute name for all courses
        Course.updateInstituteName("BridgeLabz Solutions");

        System.out.println("After Updating Institute Name:");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}

