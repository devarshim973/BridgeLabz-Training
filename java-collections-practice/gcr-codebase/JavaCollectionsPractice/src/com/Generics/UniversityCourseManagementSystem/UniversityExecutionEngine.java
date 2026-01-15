package com.Generics.UniversityCourseManagementSystem;

import java.util.ArrayList;
import java.util.List;

class UniversityExecutionEngine {

    public static void main(String[] args) {

        UniversityCourse<ExamCourse> mathCourse =
            new UniversityCourse<>(
                "Mathematics",
                "Science",
                new ExamCourse()
            );

        UniversityCourse<AssignmentCourse> csCourse =
            new UniversityCourse<>(
                "Data Structures",
                "Computer Science",
                new AssignmentCourse()
            );

        UniversityCourse<ResearchCourse> phdCourse =
            new UniversityCourse<>(
                "AI Research",
                "Engineering",
                new ResearchCourse()
            );

        mathCourse.showCourseDetails();
        mathCourse.evaluate();

        csCourse.showCourseDetails();
        csCourse.evaluate();

        phdCourse.showCourseDetails();
        phdCourse.evaluate();

        // Using wildcard collection
        List<CourseType> courseTypes = new ArrayList<>();
        courseTypes.add(new ExamCourse());
        courseTypes.add(new AssignmentCourse());
        courseTypes.add(new ResearchCourse());

        CourseManagementService.processCourses(courseTypes);
    }
}
