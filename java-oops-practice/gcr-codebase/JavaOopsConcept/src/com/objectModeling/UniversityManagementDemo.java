package com.objectModeling;

public class UniversityManagementDemo {
    public static void main(String[] args) {

        // Faculties (exist independently)
        Faculty f1 = new Faculty("Dr. Smith", "Mathematics");
        Faculty f2 = new Faculty("Dr. Alice", "Computer Science");

        // Departments (composition)
        DepartmentOne d1 = new DepartmentOne("Science Dept", "Physics");
        DepartmentOne d2 = new DepartmentOne("Engineering Dept", "Software");

        // University
        University uni = new University("Global University", d1, d2);

        // Add faculties
        uni.addFaculty(0, f1);
        uni.addFaculty(1, f2);

        // Show university info
        uni.showUniversity();

        // Delete university (departments removed)
        uni.deleteUniversity();

        // Show that faculties still exist (aggregation)
        System.out.println("\nFaculties still exist independently:");
        f1.showFaculty();
        f2.showFaculty();
    }
}
