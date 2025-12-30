package com.objectModeling;

import java.util.ArrayList;

public class Company {

    String companyName;
    ArrayList<Department> departments;

    Company(String companyName) {
        this.companyName = companyName;
        departments = new ArrayList<>();
    }

    void addDepartment(Department dept) {
        departments.add(dept);
    }

    void showCompanyDetails() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.showDepartment();
        }
    }

    public static void main(String[] args) {

        Company company = new Company("Tech Solutions");

        Department dev = new Department("Development");
        dev.addEmployee("Amit");
        dev.addEmployee("Neha");

        Department hr = new Department("HR");
        hr.addEmployee("Ravi");

        company.addDepartment(dev);
        company.addDepartment(hr);

        company.showCompanyDetails();

        // When company object is removed,
        // departments and employees are also removed
        company = null;
        System.out.println("\nCompany deleted. Departments and employees no longer exist.");
    }
}
