package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.BankLoanInterestCalculator;
import com.nt.cfgs.AppConfig;

public class MethodReplacerTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		BankLoanInterestCalculator bank = ctx.getBean("bLoan", BankLoanInterestCalculator.class);
		System.out.println(bank.calcIntrAmt(10000.0f, 1f, 2f));

		ctx.close();

	}

}
