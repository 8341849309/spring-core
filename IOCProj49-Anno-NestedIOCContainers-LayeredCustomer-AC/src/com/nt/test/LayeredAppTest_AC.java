package com.nt.test;

import java.sql.SQLException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.CustomerController;
import com.nt.vo.CustomerVO;

public class LayeredAppTest_AC {

	public static void main(String[] args) {

		// parent IOC container
		ClassPathXmlApplicationContext pCtx = new ClassPathXmlApplicationContext("com/nt/cfgs/business-beans.xml");

		// child IOC container
		ClassPathXmlApplicationContext cCtx = new ClassPathXmlApplicationContext(
				new String[] { "com/nt/cfgs/presentation-beans.xml" }, pCtx);

		CustomerController ctr = cCtx.getBean("controller", CustomerController.class);

		CustomerVO vo = new CustomerVO();
		vo.setCustId("101");
		vo.setCustName("Venkateswarlu");
		vo.setCustAddrs("Madanapalle");
		vo.setBillAmt("112.3");

		try {
			System.out.println(ctr.processData(vo));
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		cCtx.close();
	}

}
