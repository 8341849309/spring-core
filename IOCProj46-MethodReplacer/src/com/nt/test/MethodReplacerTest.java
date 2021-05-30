package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.BankLoanInterestCalculator;

public class MethodReplacerTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		BankLoanInterestCalculator bank=ctx.getBean("bLoan",BankLoanInterestCalculator.class);
		System.out.println(bank.calcIntrAmt(10000.0f, 1f, 2f));
		
		ctx.close();
		
	}

}
