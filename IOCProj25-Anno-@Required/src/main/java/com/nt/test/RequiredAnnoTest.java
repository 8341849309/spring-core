package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Robot;

public class RequiredAnnoTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		Robot robo=ctx.getBean("robot",Robot.class);
		System.out.println(robo);
		
		Robot robo1=ctx.getBean("robot1",Robot.class);
		System.out.println(robo1);
		
		
		ctx.close();
		
	}

}
