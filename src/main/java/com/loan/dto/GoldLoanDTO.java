package com.loan.dto;

public class GoldLoanDTO {
	
	private String applicantName;
	private double goldAmount;
	private double estimatedValue;
	private String purity;
	
	
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public double getGoldAmount() {
		return goldAmount;
	}
	public void setGoldAmount(double goldAmount) {
		this.goldAmount = goldAmount;
	}
	public double getEstimatedValue() {
		return estimatedValue;
	}
	public void setEstimatedValue(double estimatedValue) {
		this.estimatedValue = estimatedValue;
	}
	public String getPurity() {
		return purity;
	}
	public void setPurity(String purity) {
		this.purity = purity;
	}
	
	
	

}
