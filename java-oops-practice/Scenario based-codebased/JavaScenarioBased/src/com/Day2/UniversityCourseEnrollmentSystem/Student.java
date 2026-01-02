package com.Day2.UniversityCourseEnrollmentSystem;

public abstract class Student {
    private int studentId;
    private String studentName;
    private double gpa;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.gpa = 0.0;
    }

    public Student(int studentId, String studentName, double initialGpa) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.gpa = initialGpa;
    }

    protected void updateGpa(double gradePoint) {
        this.gpa = (this.gpa + gradePoint) / 2;
    }

    public String getTranscript() {
        return "Student ID: " + studentId +
                ", Name: " + studentName +
                ", GPA: " + gpa;
    }

    public abstract void displayStudentType();
}

