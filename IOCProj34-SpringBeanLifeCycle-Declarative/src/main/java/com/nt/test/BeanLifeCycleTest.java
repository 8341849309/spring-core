package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.VoteEligibilityCheck;

public class BeanLifeCycleTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		VoteEligibilityCheck vCheck=ctx.getBean("vCheck",VoteEligibilityCheck.class);
		System.out.println(vCheck.checkEligibility());
		
		ctx.close();
		ctx.refresh();
		System.out.println("============================");
		System.out.println(vCheck.checkEligibility());
	}

}
