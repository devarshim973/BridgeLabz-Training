package com.Day6.LoanBuddyLoanApprovalAutomation;

class LoanBuddyExecutionEngine {

    public static void main(String[] args) {

        LoanApplicantProfile applicant =
                new LoanApplicantProfile("Rahul", 720, 60000, 3000000);

        AbstractLoanProduct loan =
                new ResidentialHomeLoan(applicant);

        if (loan.approveLoan()) {
            System.out.println("Loan Approved ✅");
            System.out.println("Monthly EMI: " + loan.calculateEMI());
        } else {
            System.out.println("Loan Rejected ❌");
        }
    }
}
