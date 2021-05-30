package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.WebContainer;

public class WebRequestTest {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");

		WebContainer wc = ctx.getBean("container", WebContainer.class);

		wc.handleRequest("hi");
		System.out.println("==================");
		
		wc.handleRequest("hello");
		System.out.println("==================");
		
		wc.handleRequest("how r u");
		System.out.println("==================");
		
		ctx.close();
	}

}
