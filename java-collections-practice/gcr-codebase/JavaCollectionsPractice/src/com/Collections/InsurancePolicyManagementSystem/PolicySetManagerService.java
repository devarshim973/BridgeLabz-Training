package com.Collections.InsurancePolicyManagementSystem;

import java.time.LocalDate;
import java.util.*;

public class PolicySetManagerService {

    private Set<InsurancePolicyRecord> hashSetPolicies = new HashSet<>();
    private Set<InsurancePolicyRecord> linkedHashSetPolicies = new LinkedHashSet<>();
    private Set<InsurancePolicyRecord> treeSetPolicies =
            new TreeSet<>(new PolicyExpiryDateComparator());

    public void addPolicy(InsurancePolicyRecord policy) {
        hashSetPolicies.add(policy);
        linkedHashSetPolicies.add(policy);
        treeSetPolicies.add(policy);
    }

    public Set<InsurancePolicyRecord> getAllPolicies() {
        return hashSetPolicies;
    }

    public List<InsurancePolicyRecord> getExpiringSoonPolicies() {
        List<InsurancePolicyRecord> result = new ArrayList<>();
        LocalDate now = LocalDate.now();
        LocalDate limit = now.plusDays(30);

        for (InsurancePolicyRecord policy : hashSetPolicies) {
            if (!policy.getExpiryDate().isAfter(limit)) {
                result.add(policy);
            }
        }
        return result;
    }

    public List<InsurancePolicyRecord> getPoliciesByCoverage(String coverage) {
        List<InsurancePolicyRecord> result = new ArrayList<>();
        for (InsurancePolicyRecord policy : hashSetPolicies) {
            if (policy.getCoverageType().equalsIgnoreCase(coverage)) {
                result.add(policy);
            }
        }
        return result;
    }

    public Set<InsurancePolicyRecord> getInsertionOrderPolicies() {
        return linkedHashSetPolicies;
    }

    public Set<InsurancePolicyRecord> getSortedByExpiryPolicies() {
        return treeSetPolicies;
    }
}
