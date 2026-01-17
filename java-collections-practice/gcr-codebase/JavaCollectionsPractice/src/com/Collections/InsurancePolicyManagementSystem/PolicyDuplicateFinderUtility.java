package com.Collections.InsurancePolicyManagementSystem;

import java.util.*;

public class PolicyDuplicateFinderUtility {

    public static Set<String> findDuplicatePolicyNumbers(List<InsurancePolicyRecord> policies) {

        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (InsurancePolicyRecord policy : policies) {
            if (!seen.add(policy.getPolicyNumber())) {
                duplicates.add(policy.getPolicyNumber());
            }
        }
        return duplicates;
    }
}
