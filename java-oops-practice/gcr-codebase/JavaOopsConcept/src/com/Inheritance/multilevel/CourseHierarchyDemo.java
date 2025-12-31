package com.Inheritance.multilevel;

public class CourseHierarchyDemo {
    public static void main(String[] args) {

        StudyCourse basicCourse = new StudyCourse("Mathematics 101", 40);
        DigitalCourse onlineCourse = new DigitalCourse("Physics Online", 30, "Zoom", true);
        PremiumDigitalCourse paidCourse = new PremiumDigitalCourse("Advanced Java", 50, "Udemy", false, 200, 20);

        StudyCourse[] courses = {basicCourse, onlineCourse, paidCourse};

        System.out.println("Course Details:\n");
        for (StudyCourse c : courses) {
            c.displayCourseInfo();
            System.out.println("----------------------------");
        }
    }
}