package com.nt.test;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.cfgs.BusinessConfig;
import com.nt.cfgs.PresentationConfig;
import com.nt.controller.CustomerController;
import com.nt.vo.CustomerVO;

public class LayeredAppTest_AC {

	public static void main(String[] args) {

		// parent IOC container
		AnnotationConfigApplicationContext pCtx = new AnnotationConfigApplicationContext(BusinessConfig.class);

		// child IOC container
		AnnotationConfigApplicationContext cCtx = new AnnotationConfigApplicationContext();
		cCtx.setParent(pCtx);
		cCtx.register(PresentationConfig.class);
		cCtx.refresh();

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
