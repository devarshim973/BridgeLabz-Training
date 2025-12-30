package com.objectModeling;

public class University {
    String uniName;
    DepartmentOne dept1;  // Composition: departments owned by university
    DepartmentOne dept2;
    Faculty[] faculties; // Aggregation: faculty can exist independently

    public University(String uniName, DepartmentOne dept1, DepartmentOne dept2) {
        this.uniName = uniName;
        this.dept1 = dept1;
        this.dept2 = dept2;
        faculties = new Faculty[2]; // fixed size for simplicity
    }

    // Add faculty
    void addFaculty(int index, Faculty f) {
        if (index >= 0 && index < faculties.length) {
            faculties[index] = f;
        }
    }

    // Display University info
    void showUniversity() {
        System.out.println("\nUniversity: " + uniName);

        System.out.println("\nDepartments:");
        if (dept1 != null) dept1.showDepartmentOne();
        if (dept2 != null) dept2.showDepartmentOne();

        System.out.println("\nFaculty Members:");
        for (Faculty f : faculties) {
            if (f != null) f.showFaculty();
        }
    }

    // Delete University (Composition: departments removed)
    void deleteUniversity() {
        dept1 = null;
        dept2 = null;
        System.out.println("\nUniversity " + uniName + " deleted. Departments removed.");
    }
}