package com.Inheritance;

public class EmployeeManagementDemo {
    public static void main(String[] args) {

        // Create objects
        Manager m1 = new Manager("Alice", 101, 80000, 10);
        Developer d1 = new Developer("Bob", 102, 60000, "Java");
        Intern i1 = new Intern("Charlie", 103, 20000, "MIT");

        // Store in Employee array for polymorphism
        Employee[] employees = {m1, d1, i1};

        System.out.println("Employee Details:\n");
        for (Employee e : employees) {
            e.displayDetails();
            System.out.println("------------------------");
        }
    }
}