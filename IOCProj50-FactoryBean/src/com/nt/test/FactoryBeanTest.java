package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Customer;

public class FactoryBeanTest {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");

		Customer cust = ctx.getBean("cust", Customer.class);
		cust.showProductDetials();
		
		ctx.close();
	}
}
