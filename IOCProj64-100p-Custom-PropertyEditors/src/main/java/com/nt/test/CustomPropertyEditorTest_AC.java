package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.BankLoanIntrestCalculator;
import com.nt.cfgs.AppConfig;

public class CustomPropertyEditorTest_AC {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		// xml cfg itself internally registers the Custom Editor

		BankLoanIntrestCalculator blic = ctx.getBean("blic", BankLoanIntrestCalculator.class);
		System.out.println(blic.calculateIntrestAmount());

		ctx.close();
	}

}
