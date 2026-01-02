package com.Day2.HospitalPatientManagementSystem;

public abstract class Patient {

	private int patientId;
	private String patientName;
	private String medicalHistory;
	
	public Patient(int patientId, String patientName,String medicalHistory) {
		this.patientId= patientId;
		this.patientName=patientName;
		this.medicalHistory=medicalHistory;
		
	}
	public int getpatientId() {
		return patientId;
	}
	public String getpatientName() {
		return patientName;
	}
	//sensitive data hidden
	public String getSummary() {
		return patientId+"patientId"+ patientName+"patientName";
	}
	public abstract void displayInfo();

}
