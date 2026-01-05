package com.day4;

import java.util.ArrayList;
import java.util.List;

class Course {

    private String courseCode;
    private String courseName;
    private Faculty assignedFaculty;
    private List<Student> students = new ArrayList<>();

    public Course(String courseCode,
                  String courseName,
                  Faculty faculty) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.assignedFaculty = faculty;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printCourseDetails() {
        System.out.println(
                "Course: " + courseName +
                " | Faculty: " + assignedFaculty.name +
                " | Enrolled Students: " + students.size()
        );
    }
}
