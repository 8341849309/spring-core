package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.BankLoanIntrestCalculator;

public class CustomPropertyEditorTest_AC {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");

		// xml cfg itself internally registers the Custom Editor

		BankLoanIntrestCalculator blic = ctx.getBean("blic", BankLoanIntrestCalculator.class);
		System.out.println(blic.calculateIntrestAmount());

		ctx.close();
	}

}
