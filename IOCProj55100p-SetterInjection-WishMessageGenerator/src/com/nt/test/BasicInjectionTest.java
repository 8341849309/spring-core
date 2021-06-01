package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.beans.WishMessageGenerator;
import com.nt.cfgs.AppConfig;

public class BasicInjectionTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		WishMessageGenerator generator = (WishMessageGenerator) ctx.getBean("wMsg");

		System.out.println(generator.generateWishMessage("Venkateswarlu"));

		((AbstractApplicationContext) ctx).close();
	}

}
