package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("blic")
public class BankLoanIntrestCalculator {
	
	@Autowired
	@Value("10000,2,2")
	private  InterestAmtDetails  details;

	public BankLoanIntrestCalculator() {
		System.out.println("BankLoanIntrestCalculator.BankLoanIntrestCalculator()");
	}
	
	public  float  calculateIntrestAmount() {
		return  (details.getAmt()*details.getTime()*details.getRate())/100.0f;
	}

}
