package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.FlipKart;

public class AutowiredAnnoTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		FlipKart kart=ctx.getBean("flipkart",FlipKart.class);
		System.out.println(kart.shopping(new String[] {"Shirt","Pant"}, new Float[] {520.0f,670.0f}));
		
		ctx.close();
		
	}

}
