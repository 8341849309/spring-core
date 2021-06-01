package com.nt.beans;

public class BankLoanIntrestCalculator {
	
	private  InterestAmtDetails  details;

	public BankLoanIntrestCalculator() {
		System.out.println("BankLoanIntrestCalculator.BankLoanIntrestCalculator()");
	}
	
	public void setDetails(InterestAmtDetails details) {
		this.details = details;
	}
	
	public  float  calculateIntrestAmount() {
		return  (details.getAmt()*details.getTime()*details.getRate())/100.0f;
	}

}
