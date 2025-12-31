package com.Inheritance.hierarchicalinheritance;

public class SchoolRoleDemo {
    public static void main(String[] args) {

        TeacherRole teacher = new TeacherRole("Mr. Sharma", 40, "Mathematics");
        StudentRole student = new StudentRole("Aman", 15, "10th Grade");
        StaffRole staff = new StaffRole("Ramesh", 35, "Administration");

        PersonBase[] people = { teacher, student, staff };

        for (PersonBase p : people) {
            if (p instanceof TeacherRole) {
                ((TeacherRole) p).displayRole();
            } else if (p instanceof StudentRole) {
                ((StudentRole) p).displayRole();
            } else if (p instanceof StaffRole) {
                ((StaffRole) p).displayRole();
            }
            System.out.println("-----------------------");
        }
    }
}