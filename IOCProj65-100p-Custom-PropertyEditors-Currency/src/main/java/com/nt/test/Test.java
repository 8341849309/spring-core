package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.Store;
import com.nt.cfgs.AppConfig;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		Store st = ctx.getBean("store", Store.class);
		System.out.println(st.showProduct());

		ctx.close();
	}

}
