package com.Day2.UniversityCourseEnrollmentSystem;

public class UniversityEnrollmentApplication {
    public static void main(String[] args) {

        Student studentOne = new Undergraduate(101, "Rahul");
        Student studentTwo = new Postgraduate(102, "Sneha", 3.5);

        Course javaCourse = new Course("CS101", "Core Java", 4);

        Faculty professor = new Faculty(201, "Dr. Verma");

        Graded letterGrading = new Enrollment(studentOne, javaCourse);
        Graded passFailGrading = new PassFailEnrollment(studentTwo);

        professor.assignGrade(letterGrading, 85);
        professor.assignGrade(passFailGrading, 60);

        studentOne.displayStudentType();
        System.out.println(studentOne.getTranscript());

        studentTwo.displayStudentType();
        System.out.println(studentTwo.getTranscript());
    }
}
