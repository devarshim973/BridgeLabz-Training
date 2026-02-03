package com.Day4.NullPointerException.EmployeeOfficeSystem;

import java.util.Optional;

class Employee {

    private int id;
    private String firstName;
    private String middleName;     // may be null
    private String lastName;
    private String email;
    private Employee manager;      // may be null
    private Double bonus;           // may be null
    private String insurance;       // may be null

    public Employee(int id, String firstName, String middleName, String lastName,
                    String email, Employee manager, Double bonus, String insurance) {

        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.email = email;
        this.manager = manager;
        this.bonus = bonus;
        this.insurance = insurance;
    }

    public String getEmail() {
        return email;
    }

    // 1. Fetch manager safely
    public Optional<Employee> getManager() {
        return Optional.ofNullable(manager);
    }

    // 2. Bonus with default value
    public Optional<Double> getBonus() {
        return Optional.ofNullable(bonus);
    }

    // 4. Insurance safely
    public Optional<String> getInsurance() {
        return Optional.ofNullable(insurance);
    }

    // 5. Middle name if present
    public Optional<String> getMiddleName() {
        return Optional.ofNullable(middleName);
    }

    public String getFirstName() {
        return firstName;
    }
}
