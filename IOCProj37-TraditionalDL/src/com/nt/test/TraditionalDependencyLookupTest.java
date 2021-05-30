package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Cricketer;

public class TraditionalDependencyLookupTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		Cricketer player = ctx.getBean("cricketer", Cricketer.class);
		// invoke methods
		System.out.println(".....................");
		player.bowling();

		System.out.println(".....................");
		player.fielding();

		System.out.println(".....................");
		player.batting();

		
		((AbstractApplicationContext) ctx).close();
	}

}
