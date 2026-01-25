package com.Collections.InsurancePolicyManagementSystem;

import java.time.LocalDate;
import java.util.Objects;

public class InsurancePolicyRecord {

    private String policyNumber;
    private String policyHolderName;
    private LocalDate expiryDate;
    private String coverageType;
    private double premiumAmount;

    public InsurancePolicyRecord(String policyNumber, String policyHolderName,
                                 LocalDate expiryDate, String coverageType,
                                 double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public String getCoverageType() {
        return coverageType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InsurancePolicyRecord)) return false;
        InsurancePolicyRecord that = (InsurancePolicyRecord) o;
        return policyNumber.equals(that.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    @Override
    public String toString() {
        return policyNumber + " | " + policyHolderName +
                " | " + coverageType + " | Exp: " + expiryDate;
    }
}
