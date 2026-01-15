package com.Generics.UniversityCourseManagementSystem;

class ResearchCourse extends CourseType {   // MUST extend CourseType
    @Override
    public void evaluateStudent() {
        System.out.println("Research evaluation");
    }
}
