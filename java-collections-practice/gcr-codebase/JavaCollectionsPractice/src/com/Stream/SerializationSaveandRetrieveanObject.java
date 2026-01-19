package com.Stream;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializationSaveandRetrieveanObject {

    // Inner Employee class
    static class Employee implements Serializable {

        private static final long serialVersionUID = 1L;

        private int id;
        private String name;
        private String department;
        private double salary;

        public Employee(int id, String name, String department, double salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee [ID=" + id +
                   ", Name=" + name +
                   ", Department=" + department +
                   ", Salary=" + salary + "]";
        }
    }

    private static final String FILE_NAME = "employees.dat";

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Alice", "HR", 45000));
        employees.add(new Employee(102, "Bob", "IT", 60000));
        employees.add(new Employee(103, "Charlie", "Finance", 55000));

        serialize(employees);
        deserialize();
    }

    // Serialize employee list
    private static void serialize(List<Employee> employees) {
        try (ObjectOutputStream out =
                     new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {

            out.writeObject(employees);
            System.out.println("Employees saved successfully.");

        } catch (IOException e) {
            System.out.println("Serialization error.");
            e.printStackTrace();
        }
    }

    // Deserialize employee list
    private static void deserialize() {
        try (ObjectInputStream in =
                     new ObjectInputStream(new FileInputStream(FILE_NAME))) {

            List<Employee> employees =
                    (List<Employee>) in.readObject();

            System.out.println("\nRetrieved Employees:");
            for (Employee emp : employees) {
                System.out.println(emp);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error.");
            e.printStackTrace();
        }
    }
}
