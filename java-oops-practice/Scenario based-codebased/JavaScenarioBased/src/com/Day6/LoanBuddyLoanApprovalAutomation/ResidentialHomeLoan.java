package com.Day6.LoanBuddyLoanApprovalAutomation;

class ResidentialHomeLoan extends AbstractLoanProduct {

    public ResidentialHomeLoan(LoanApplicantProfile applicant) {
        super("Home Loan", 20, 8.5, applicant);
    }

    @Override
    public boolean approveLoan() {
        boolean eligible =
                applicant.getCreditScore() >= 700 &&
                applicant.getIncome() >= 50000;

        setApprovalStatus(eligible);
        return eligible;
    }

    @Override
    public double calculateEMI() {
        return EMICalculatorUtility.calculate(
                applicant.getLoanAmount(),
                interestRate,
                termInYears
        );
    }
}

