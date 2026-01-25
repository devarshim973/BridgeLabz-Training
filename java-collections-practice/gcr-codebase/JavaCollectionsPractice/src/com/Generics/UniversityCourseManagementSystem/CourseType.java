package com.Generics.UniversityCourseManagementSystem;

abstract class CourseType {

    protected String evaluationMethod;

    public abstract void evaluateStudent();

    public String getEvaluationMethod() {
        return evaluationMethod;
    }
}
