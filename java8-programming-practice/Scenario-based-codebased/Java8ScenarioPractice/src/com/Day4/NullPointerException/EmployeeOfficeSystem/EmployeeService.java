package com.Day4.NullPointerException.EmployeeOfficeSystem;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class EmployeeService {

    private List<Employee> employees;

    public EmployeeService() {

        Employee manager = new Employee(
                1, "Suresh", null, "Sharma",
                "suresh@company.com", null, 5000.0, "Health Plus"
        );

        employees = Arrays.asList(
                manager,
                new Employee(
                        2, "Amit", "Kumar", "Verma",
                        "amit@company.com", manager, null, null
                )
        );
    }

    // 3. Find employee by email
    public Optional<Employee> findByEmail(String email) {
        return employees.stream()
                .filter(e -> e.getEmail().equalsIgnoreCase(email))
                .findFirst();
    }
}
