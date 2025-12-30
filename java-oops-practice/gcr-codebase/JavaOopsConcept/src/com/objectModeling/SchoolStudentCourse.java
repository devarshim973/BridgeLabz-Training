package com.objectModeling;

public class SchoolStudentCourse {

    public static void main(String[] args) {

        School school = new School("Green Valley School");

        Student s1 = new Student("Rohan");
        Student s2 = new Student("Anita");

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c1);

        school.showStudents();
        System.out.println();

        s1.showCourses();
        System.out.println();

        c1.showStudents();
    }
}

