package com.day4;

import java.util.ArrayList;
import java.util.List;

class Student extends Person implements ICourseActions {

    private List<Course> enrolledCourses = new ArrayList<>();

    // Sensitive data
    private int[] grades;

    public Student(int id, String name, String email, int[] grades) {
        super(id, name, email);
        this.grades = grades;
    }

    // GPA calculation using operators
    public double calculateGPA() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    @Override
    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
        course.addStudent(this);
    }

    @Override
    public void dropCourse(Course course) {
        enrolledCourses.remove(course);
    }

    @Override
    public void printDetails() {
        System.out.println(
                "Student ID: " + id +
                ", Name: " + name +
                ", GPA: " + calculateGPA()
        );
    }
}
