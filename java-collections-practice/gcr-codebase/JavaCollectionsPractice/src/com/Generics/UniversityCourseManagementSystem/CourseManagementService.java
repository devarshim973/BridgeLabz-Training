package com.Generics.UniversityCourseManagementSystem;

import java.util.List;

class CourseManagementService {

    public static void processCourses(
            List<? extends CourseType> courseTypes) {

        for (CourseType type : courseTypes) {
            System.out.println("Evaluation Method: " +
                               type.getEvaluationMethod());
            type.evaluateStudent();
        }
    }
}
