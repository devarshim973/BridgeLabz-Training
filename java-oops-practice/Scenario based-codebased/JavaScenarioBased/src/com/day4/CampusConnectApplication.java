package com.day4;

public class CampusConnectApplication {

    public static void main(String[] args) {

        Faculty faculty =
                new Faculty(1, "Dr. rajput",
                        "sharma@college.edu", "Computer Science");

        Course course =
                new Course("CS101", "Data Structures", faculty);

        Student student1 =
                new Student(101, "aman",
                        "amit@college.edu",
                        new int[]{8, 9, 7});

        Student student2 =
                new Student(102, "Neha",
                        "neha@college.edu",
                        new int[]{9, 8, 9});

        student1.enrollCourse(course);
        student2.enrollCourse(course);

        // Polymorphism
        Person p1 = student1;
        Person p2 = faculty;

        p1.printDetails();
        p2.printDetails();

        course.printCourseDetails();
    }
}
