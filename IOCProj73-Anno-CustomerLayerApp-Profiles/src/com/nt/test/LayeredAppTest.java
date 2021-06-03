package com.nt.test;

import java.sql.SQLException;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import com.nt.controller.CustomerController;
import com.nt.vo.CustomerVO;

public class LayeredAppTest {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext();

		ConfigurableEnvironment env = (ConfigurableEnvironment) ctx.getEnvironment();
		env.setActiveProfiles("test");

		ctx.setConfigLocation("com/nt/cfgs/applicationContext.xml");
		ctx.refresh();

		CustomerController ctr = ctx.getBean("controller", CustomerController.class);

		CustomerVO vo = new CustomerVO();
		vo.setCustName("Krishna");
		vo.setCustAddrs("Madanapalle");
		vo.setBillAmt("1300");

		try {
			System.out.println(ctr.processData(vo));
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		ctx.close();
	}

}
