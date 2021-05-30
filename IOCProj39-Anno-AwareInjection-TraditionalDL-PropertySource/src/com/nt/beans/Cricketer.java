package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("cricketer")
@PropertySource(value = {"com/nt/commons/myfile.properties"})
public class Cricketer implements BeanFactoryAware {

	@Value("${player.name}")
	private String name;
	@Value("${player.jerseyNo}")
	private int jersyNo;

	private BeanFactory factory;

	// Aware Injection method
	@Override
	public void setBeanFactory(BeanFactory factory) throws BeansException {
		this.factory = factory;
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
		System.out.println("Mr." + name + " having jerseyNo " + jersyNo + " is bowling");
	}

	public void fielding() {
		System.out.println("Mr." + name + " having jerseyNo " + jersyNo + " is fielding");
	}

	public void batting() {
		System.out.println("Mr." + name + " having jerseyNo " + jersyNo + " is batting");
		System.out.println("2nd IOC Container");
		CricketBat bat = factory.getBean("bat", CricketBat.class);
		// Use CricketBat object
		int score = bat.scoreRuns();
		System.out.println("Cricketer Runs are:: " + score);

	}

}
