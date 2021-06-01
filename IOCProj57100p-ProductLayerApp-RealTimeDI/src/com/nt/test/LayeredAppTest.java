package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.cfgs.AppConfig;
import com.nt.controller.MainController;
import com.nt.vo.ProductVO;

public class LayeredAppTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		MainController ctr = ctx.getBean("controller", MainController.class);

		try {
			ProductVO vo = new ProductVO();
			vo.setpName("Shirt");
			vo.setQuantity("2");
			vo.setBasePrice("70");
			vo.setStatus("Available");
			vo.setType("Jeans");

			System.out.println(ctr.processData(vo));
		} catch (Exception e) {
			e.printStackTrace();
		}

		((AbstractApplicationContext) ctx).close();
	}

}
