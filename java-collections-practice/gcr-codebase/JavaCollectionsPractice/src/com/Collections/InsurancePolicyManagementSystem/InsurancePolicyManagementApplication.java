package com.Collections.InsurancePolicyManagementSystem;

import java.time.LocalDate;

public class InsurancePolicyManagementApplication {

    public static void main(String[] args) {

        PolicySetManagerService manager = new PolicySetManagerService();

        manager.addPolicy(new InsurancePolicyRecord(
                "P101", "Alice", LocalDate.now().plusDays(15), "Health", 3000));

        manager.addPolicy(new InsurancePolicyRecord(
                "P102", "Bob", LocalDate.now().plusDays(45), "Auto", 4000));

        manager.addPolicy(new InsurancePolicyRecord(
                "P103", "Carol", LocalDate.now().plusDays(10), "Health", 3500));

        System.out.println("All Policies:");
        manager.getAllPolicies().forEach(System.out::println);

        System.out.println("\nExpiring Soon:");
        manager.getExpiringSoonPolicies().forEach(System.out::println);

        System.out.println("\nHealth Policies:");
        manager.getPoliciesByCoverage("Health").forEach(System.out::println);

        System.out.println("\nInsertion Order:");
        manager.getInsertionOrderPolicies().forEach(System.out::println);

        System.out.println("\nSorted by Expiry Date:");
        manager.getSortedByExpiryPolicies().forEach(System.out::println);
    }
}
