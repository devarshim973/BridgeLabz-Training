package com.objectModeling;
public class StudentNew {
    String name;

    StudentNew(String name) {
        this.name = name;
    }

    void enrollCourse(CourseNew course) {
        System.out.println(name + " enrolled in " + course.courseName);
    }
}
