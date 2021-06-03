package com.nt;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.CustomerController;
import com.nt.vo.CustomerVO;

@SpringBootApplication
public class LayeredAppTest {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(LayeredAppTest.class, args);

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
