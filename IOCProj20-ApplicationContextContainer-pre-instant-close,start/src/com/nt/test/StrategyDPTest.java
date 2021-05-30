package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.vehicle.Vehicle;

public class StrategyDPTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");

		/*
		 * Vehicle veh = ctx.getBean("vehicle", Vehicle.class); veh.move("Madanapalle",
		 * "Hyderabad");
		 */
		((AbstractApplicationContext) ctx).close();
		
	}

}
