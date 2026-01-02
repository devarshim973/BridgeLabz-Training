package com.Day2.UniversityCourseEnrollmentSystem;

public class Undergraduate extends Student {

    public Undergraduate(int id, String name) {
        super(id, name);
    }

    public Undergraduate(int id, String name, double gpa) {
        super(id, name, gpa);
    }

    @Override
    public void displayStudentType() {
        System.out.println("Undergraduate Student");
    }
}
