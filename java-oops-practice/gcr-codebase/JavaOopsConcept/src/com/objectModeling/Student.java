package com.objectModeling;

import java.util.ArrayList;

class Student {

    String name;
    ArrayList<Course> courses;

    Student(String name) {
        this.name = name;
        courses = new ArrayList<>();
    }

    void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    void showCourses() {
        System.out.println("Courses of " + name + ":");
        for (Course c : courses) {
            System.out.println("- " + c.courseName);
        }
    }
}

