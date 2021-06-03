package com.nt;

import java.sql.SQLException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import com.nt.cfgs.AppConfig;
import com.nt.controller.CustomerController;
import com.nt.vo.CustomerVO;

public class LayeredAppTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

		ConfigurableEnvironment env = (ConfigurableEnvironment) ctx.getEnvironment();
		env.setActiveProfiles("prod");

		ctx.register(AppConfig.class);
		ctx.refresh();

		CustomerController ctr = ctx.getBean("controller", CustomerController.class);

		CustomerVO vo = new CustomerVO();
		vo.setCustName("Krishna-prod");
		vo.setCustAddrs("Madanapalle");
		vo.setBillAmt("1300");

		try {
			System.out.println(ctr.processData(vo));
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		((ConfigurableApplicationContext) ctx).close();
	}

}
