package com.objectModeling;

class UniversitySystem {

    StudentNew[] students;
    CourseNew[] courses;

    UniversitySystem() {   // FIXED CONSTRUCTOR
        students = new StudentNew[2];
        courses = new CourseNew[2];
    }

    void addStudentNew(int index, StudentNew student) {
        students[index] = student;
    }

    void addCourseNew(int index, CourseNew course) {
        courses[index] = course;
    }

    void showUniversityDetails() {
        System.out.println("\n--- University Details ---");

        System.out.println("\nCourses:");
        for (CourseNew c : courses) {
            if (c != null) c.showCourseDetails();
        }
    }
}

