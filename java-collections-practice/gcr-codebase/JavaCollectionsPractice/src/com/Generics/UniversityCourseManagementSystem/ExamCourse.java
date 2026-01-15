package com.Generics.UniversityCourseManagementSystem;

class ExamCourse extends CourseType {

    public ExamCourse() {
        evaluationMethod = "Written Exam";
    }

    @Override
    public void evaluateStudent() {
        System.out.println("Student evaluated through final written exam.");
    }
}
