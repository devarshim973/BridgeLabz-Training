package com.Day6.LoanBuddyLoanApprovalAutomation;

class EMICalculatorUtility {
	public static double calculate(double principal,double annualRate, int years) {
		double monthlyRate= annualRate/(12*100);
		int months= years*12;
		return(principal*monthlyRate*Math.pow(1 + monthlyRate, months))/(Math.pow(1 + monthlyRate, months) - 1);
	}

}
