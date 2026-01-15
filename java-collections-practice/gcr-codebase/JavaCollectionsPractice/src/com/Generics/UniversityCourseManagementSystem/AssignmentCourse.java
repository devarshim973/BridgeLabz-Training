package com.Generics.UniversityCourseManagementSystem;

class AssignmentCourse extends CourseType {

    public AssignmentCourse() {
        evaluationMethod = "Assignments";
    }

    @Override
    public void evaluateStudent() {
        System.out.println("Student evaluated through multiple assignments.");
    }
}
