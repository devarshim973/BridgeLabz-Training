package com.Day6.LoanBuddyLoanApprovalAutomation;

class LoanApplicantProfile {
	private String name;
	private int creditScore;
	private double income;
	private double loanAmount;
	
	public LoanApplicantProfile(String name, int creditScore, double income, double loanAmount) {
		this.name = name;
		this.creditScore= creditScore;
		this.income= income;
		this.loanAmount= loanAmount;
		
	}
	public int getCreditScore() {
		return creditScore;
	}
	
	public double getIncome() {
		return income;
	}
	
	public double getLoanAmount() {
		return loanAmount;
	}
	
	public String getName() {
		return name;
	}

}
