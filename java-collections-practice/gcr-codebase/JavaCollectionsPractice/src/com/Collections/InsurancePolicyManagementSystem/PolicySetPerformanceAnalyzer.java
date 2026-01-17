package com.Collections.InsurancePolicyManagementSystem;

import java.time.LocalDate;
import java.util.*;

public class PolicySetPerformanceAnalyzer {

    public static void main(String[] args) {

        InsurancePolicyRecord samplePolicy =
                new InsurancePolicyRecord("PX999", "Test User",
                        LocalDate.now().plusDays(60), "Health", 5000);

        comparePerformance(new HashSet<>(), samplePolicy, "HashSet");
        comparePerformance(new LinkedHashSet<>(), samplePolicy, "LinkedHashSet");
        comparePerformance(new TreeSet<>(new PolicyExpiryDateComparator()),
                samplePolicy, "TreeSet");
    }

    private static void comparePerformance(Set<InsurancePolicyRecord> set,
                                           InsurancePolicyRecord policy,
                                           String type) {

        long startAdd = System.nanoTime();
        set.add(policy);
        long endAdd = System.nanoTime();

        long startSearch = System.nanoTime();
        set.contains(policy);
        long endSearch = System.nanoTime();

        long startRemove = System.nanoTime();
        set.remove(policy);
        long endRemove = System.nanoTime();

        System.out.println("\n" + type + " Performance:");
        System.out.println("Add Time: " + (endAdd - startAdd));
        System.out.println("Search Time: " + (endSearch - startSearch));
        System.out.println("Remove Time: " + (endRemove - startRemove));
    }
}
