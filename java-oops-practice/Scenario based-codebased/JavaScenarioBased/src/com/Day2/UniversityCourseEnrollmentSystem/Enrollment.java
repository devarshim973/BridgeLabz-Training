package com.Day2.UniversityCourseEnrollmentSystem;

public class Enrollment implements Graded {
    private Student student;
    private Course course;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    @Override
    public void assignGrade(double score) {
        double gradePoint;

        if (score >= 90)
            gradePoint = 4.0;
        else if (score >= 80)
            gradePoint = 3.0;
        else if (score >= 70)
            gradePoint = 2.0;
        else
            gradePoint = 1.0;

        student.updateGpa(gradePoint);
    }
}
