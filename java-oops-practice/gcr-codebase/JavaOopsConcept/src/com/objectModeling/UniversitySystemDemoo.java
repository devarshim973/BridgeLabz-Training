package com.objectModeling;
public class UniversitySystemDemoo {
    public static void main(String[] args) {

        UniversitySystem uni = new UniversitySystem();

        // Students
        StudentNew s1 = new StudentNew("Rohan");
        StudentNew s2 = new StudentNew("Amit");

        // Professor
        ProfessorNew p1 = new ProfessorNew("Dr. Sharma");

        // Courses
        CourseNew c1 = new CourseNew("Java Programming");
        CourseNew c2 = new CourseNew("Data Structures");

        // Assign professor to course
        p1.assignCourse(c1);
        c1.setProfessor(p1);

        // Enroll students
        s1.enrollCourse(c1);
        s2.enrollCourse(c2);

        // Add to university
        uni.addStudentNew(0, s1);
        uni.addStudentNew(1, s2);

        uni.addCourseNew(0, c1);
        uni.addCourseNew(1, c2);

        // Display details
        uni.showUniversityDetails();
    }
}
