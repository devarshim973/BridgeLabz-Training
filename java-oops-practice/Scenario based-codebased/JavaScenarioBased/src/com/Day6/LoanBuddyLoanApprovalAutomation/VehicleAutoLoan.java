package com.Day6.LoanBuddyLoanApprovalAutomation;

class VehicleAutoLoan extends AbstractLoanProduct {

    public VehicleAutoLoan(LoanApplicantProfile applicant) {
        super("Auto Loan", 7, 10.5, applicant);
    }

    @Override
    public boolean approveLoan() {
        boolean eligible =
                applicant.getCreditScore() >= 650 &&
                applicant.getIncome() >= 30000;

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
