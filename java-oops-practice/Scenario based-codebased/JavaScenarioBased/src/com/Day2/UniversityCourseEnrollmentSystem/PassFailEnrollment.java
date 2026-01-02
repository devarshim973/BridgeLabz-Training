package com.Day2.UniversityCourseEnrollmentSystem;

public class PassFailEnrollment implements Graded {
    private Student student;

    public PassFailEnrollment(Student student) {
        this.student = student;
    }

    @Override
    public void assignGrade(double score) {
        if (score >= 50) {
            student.updateGpa(2.0);
        }
    }
}
