package com.Day4.FunctionalInterface.ComparatorComparisonLogic;


import java.util.Comparator;

public class ComparatorScenario {

    // Simple data classes
    static class Student {
        int rank;
        Student(int rank) { this.rank = rank; }
    }

    static class Employee {
        double salary;
        Employee(double salary) { this.salary = salary; }
    }

    static class Product {
        double price;
        Product(double price) { this.price = price; }
    }

    static class BankAccount {
        double balance;
        BankAccount(double balance) { this.balance = balance; }
    }

    public static void main(String[] args) {

        // 1. Compare two students by rank
        Comparator<Student> byRank =
                (s1, s2) -> s1.rank - s2.rank;
        System.out.println(byRank.compare(new Student(2), new Student(1)));

        // 2. Compare two employees by salary
        Comparator<Employee> bySalary =
                (e1, e2) -> Double.compare(e1.salary, e2.salary);
        System.out.println(bySalary.compare(new Employee(40000), new Employee(30000)));

        // 3. Compare two products by price
        Comparator<Product> byPrice =
                (p1, p2) -> Double.compare(p1.price, p2.price);
        System.out.println(byPrice.compare(new Product(500), new Product(800)));

        // 4. Compare two strings by length
        Comparator<String> byLength =
                (s1, s2) -> s1.length() - s2.length();
        System.out.println(byLength.compare("Java", "Programming"));

        // 5. Compare two bank accounts by balance
        Comparator<BankAccount> byBalance =
                (a1, a2) -> Double.compare(a1.balance, a2.balance);
        System.out.println(byBalance.compare(new BankAccount(10000), new BankAccount(15000)));
    }
}
