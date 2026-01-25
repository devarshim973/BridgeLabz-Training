package com.Generics.UniversityCourseManagementSystem;

class UniversityCourse<T extends CourseType> {

    private String courseName;
    private String department;
    private T courseType;

    public UniversityCourse(String courseName,
                            String department,
                            T courseType) {
        this.courseName = courseName;
        this.department = department;
        this.courseType = courseType;
    }

    public void showCourseDetails() {
        System.out.println(
            courseName + " | " +
            department + " | Evaluation: " +
            courseType.getEvaluationMethod()
        );
    }

    public void evaluate() {
        courseType.evaluateStudent();
    }
}
