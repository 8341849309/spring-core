package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.cfgs.AppConfig;
import com.nt.vehicle.Vehicle;


public class StrategyDPTest {

	public static void main(String[] args) {

		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	
		Vehicle veh=(Vehicle) ctx.getBean("vehicle");
		veh.move("Madanapalle", "Hyderabad");

		((AbstractApplicationContext) ctx).close();
	}

}
