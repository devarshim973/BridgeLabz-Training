package com.Day2.UniversityCourseEnrollmentSystem;

public class Faculty {
    private int facultyId;
    private String facultyName;

    public Faculty(int facultyId, String facultyName) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
    }

    public void assignGrade(Graded gradingStyle, double score) {
        gradingStyle.assignGrade(score);
    }
}
