package com.objectModeling;
class CourseNew {
    String courseName;
    ProfessorNew professor;

    CourseNew(String courseName) {
        this.courseName = courseName;
    }

    void setProfessor(ProfessorNew professor) {
        this.professor = professor;
    }

    void showCourseDetails() {
        System.out.print("Course: " + courseName);
        if (professor != null) {
            System.out.println(", Professor: " + professor.name);
        } else {
            System.out.println(", Professor: Not Assigned");
        }
    }
}
