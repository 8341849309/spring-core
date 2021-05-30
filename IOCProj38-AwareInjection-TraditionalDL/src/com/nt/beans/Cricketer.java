package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.AbstractApplicationContext;

public class Cricketer implements ApplicationContextAware {

	private String name;
	private int jersyNo;
	private ApplicationContext ctx;

	// Aware Injection method
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx = ctx;
	}

	public Cricketer() {
		System.out.println("Cricketer.Cricketer()");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setJersyNo(int jersyNo) {
		this.jersyNo = jersyNo;
	}

	public void bowling() {
		System.out.println("Mr." + name + "having jerseyNo " + jersyNo + " is bowling");
	}

	public void fielding() {
		System.out.println("Mr." + name + "having jerseyNo " + jersyNo + " is fielding");
	}

	public void batting() {
		System.out.println("Mr." + name + "having jerseyNo " + jersyNo + " is batting");
		System.out.println("2nd IOC Container");
		CricketBat bat = ctx.getBean("bat", CricketBat.class);
		// Use CricketBat object
		int score = bat.scoreRuns();
		System.out.println("Cricketer Runs are:: " + score);

		((AbstractApplicationContext) ctx).close();
	}

}
