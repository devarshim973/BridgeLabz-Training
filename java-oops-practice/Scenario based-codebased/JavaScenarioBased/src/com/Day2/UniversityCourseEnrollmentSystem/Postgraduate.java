package com.Day2.UniversityCourseEnrollmentSystem;

public class Postgraduate extends Student {

    public Postgraduate(int id, String name) {
        super(id, name);
    }

    public Postgraduate(int id, String name, double gpa) {
        super(id, name, gpa);
    }

    @Override
    public void displayStudentType() {
        System.out.println("Postgraduate Student");
    }
}
