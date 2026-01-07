package com.Day6.LoanBuddyLoanApprovalAutomation;

interface LoanApprovalPolicy{
	// approved loan
	boolean approveLoan();
	
	//calculate EMI
	boolean calculater();
	
}
