package com.nt.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class BankLoanInterestReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("BankLoanInterestReplacer.reimplement():: (Simple Interest)");
		//Main Method args
		float pAmt=(float) args[0];
		float rate=(float) args[1];
		float time=(float) args[2];
		
		return (pAmt*rate*time)/100;
	}

}
