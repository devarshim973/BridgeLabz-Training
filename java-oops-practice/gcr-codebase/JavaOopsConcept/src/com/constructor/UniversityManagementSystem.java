package com.constructor;

public class UniversityManagementSystem {

    public static void main(String[] args) {

        Student s1 = new Student(101, "Rahul", 8.2);
        s1.displayStudentDetails();

        System.out.println("--------------------------");

        PostgraduateStudent pg1 =
                new PostgraduateStudent(201, "Anita", 8.9, "Computer Science");

        pg1.displayPostgraduateDetails();

        // Updating CGPA using setter
        pg1.setCGPA(9.1);

        System.out.println("After CGPA Update:");
        pg1.displayPostgraduateDetails();
    }
}