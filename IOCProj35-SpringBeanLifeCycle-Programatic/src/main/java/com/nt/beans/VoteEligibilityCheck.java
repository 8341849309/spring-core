package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class VoteEligibilityCheck implements InitializingBean, DisposableBean {

	private String name;
	private int age;
	private Date verificationDate;

	// setter methods
	public VoteEligibilityCheck() {
		System.out.println("VoteEligibilityCheck():: 0-param");
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("VoteEligibilityCheck.setName()");
	}

	public void setAge(int age) {
		this.age = age;
		System.out.println("VoteEligibilityCheck.setAge()");
	}

	public void setVerificationDate(Date verificationDate) {
		this.verificationDate = verificationDate;
		System.out.println("VoteEligibilityCheck.setVerificationDate()");
	}

	// init life cycle method
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("VoteEligibilityCheck.init()");

		if (name == null || name.isBlank() || age <= 0 || age >= 125) {
			throw new IllegalArgumentException("Please provide correct details");
		}

	}

	// business method
	public String checkEligibility() {
		System.out.println("VoteEligibilityCheck.checkEligibility()");
		verificationDate = new Date();
		if (age >= 18)
			return name + " is eligible for voting. Verified on " + verificationDate;
		else
			return name + " is not eligible for voting. Verified on " + verificationDate;
	}

	// destroy life cycle method
	@Override
	public void destroy() throws Exception {
		System.out.println("VoteEligibilityCheck.destroy()");
		name = "";
		age = 0;
		verificationDate = null;
	}

}
