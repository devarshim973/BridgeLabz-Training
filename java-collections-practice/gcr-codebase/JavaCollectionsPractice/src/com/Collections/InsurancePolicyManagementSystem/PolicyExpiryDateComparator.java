package com.Collections.InsurancePolicyManagementSystem;

import java.util.Comparator;

public class PolicyExpiryDateComparator implements Comparator<InsurancePolicyRecord> {

    @Override
    public int compare(InsurancePolicyRecord p1, InsurancePolicyRecord p2) {
        int dateCompare = p1.getExpiryDate().compareTo(p2.getExpiryDate());
        return dateCompare != 0 ? dateCompare :
                p1.getPolicyNumber().compareTo(p2.getPolicyNumber());
    }
}
