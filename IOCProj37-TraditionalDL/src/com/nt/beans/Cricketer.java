package com.nt.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cricketer {

	private String name;
	private int jersyNo;
	private String beanId;

	public Cricketer() {
		System.out.println("Cricketer.Cricketer()");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setJersyNo(int jersyNo) {
		this.jersyNo = jersyNo;
	}

	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}

	public void bowling() {
		System.out.println("Mr." + name + "having jerseyNo " + jersyNo + " is bowling");
	}

	public void fielding() {
		System.out.println("Mr." + name + "having jerseyNo " + jersyNo + " is fielding");
	}

	public void batting() {
		System.out.println("Mr." + name + "having jerseyNo " + jersyNo + " is batting");
		// Dependency LookUp to get CricketBat
		// create extra IOC container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		System.out.println("2nd IOC Container");
		CricketBat bat = ctx.getBean(beanId, CricketBat.class);
		// Use CricketBat object
		int score = bat.scoreRuns();
		System.out.println("Cricketer Runs are:: "+score);
		
		((AbstractApplicationContext) ctx).close();
	}
}
