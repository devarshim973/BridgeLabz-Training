package com.Day6.LoanBuddyLoanApprovalAutomation;

abstract class AbstractLoanProduct implements LoanApprovalPolicy {

    protected String loanType;
    protected int termInYears;
    protected double interestRate;
    protected LoanApplicantProfile applicant;

    private boolean approved;

    public AbstractLoanProduct(
            String loanType,
            int termInYears,
            double interestRate,
            LoanApplicantProfile applicant) {

        this.loanType = loanType;
        this.termInYears = termInYears;
        this.interestRate = interestRate;
        this.applicant = applicant;
    }

    // 🔹 Declare abstract methods
    public abstract boolean approveLoan();

    public abstract double calculateEMI();

    protected void setApprovalStatus(boolean status) {
        this.approved = status;
    }

    public boolean isApproved() {
        return approved;
    }
}
