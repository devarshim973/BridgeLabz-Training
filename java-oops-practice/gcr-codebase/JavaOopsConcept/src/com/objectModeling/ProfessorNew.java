package com.objectModeling;
public class ProfessorNew {
    String name;

    ProfessorNew(String name) {
        this.name = name;
    }

    // FIXED METHOD
    void assignCourse(CourseNew course) {
        System.out.println(name + " is assigned to teach " + course.courseName);
    }
}
