package com.Day4.NullPointerException.EmployeeOfficeSystem;

public class EmployeeOfficeMain {

    public static void main(String[] args) {

        EmployeeService service = new EmployeeService();

        Employee emp = service.findByEmail("amit@company.com")
                .orElseThrow(() ->
                        new EmployeeNotFoundException("Employee not found")
                );

        // 1. Manager details
        String managerName = emp.getManager()
                .map(Employee::getFirstName)
                .orElse("No Manager Assigned");
        System.out.println("Manager: " + managerName);

        // 2. Bonus default = 0
        double bonus = emp.getBonus().orElse(0.0);
        System.out.println("Bonus: " + bonus);

        // 4. Insurance details
        String insurance = emp.getInsurance()
                .orElse("Insurance not available");
        System.out.println("Insurance: " + insurance);

        // 5. Middle name only if present
        emp.getMiddleName().ifPresent(
                m -> System.out.println("Middle Name: " + m)
        );
    }
}
