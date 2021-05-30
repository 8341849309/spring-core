package com.nt.test;

import java.sql.SQLException;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.CustomerController;
import com.nt.vo.CustomerVO;

public class LayeredAppTest {

	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");

		CustomerController ctr = factory.getBean("controller", CustomerController.class);

		CustomerVO vo = new CustomerVO();
		vo.setCustId("101");
		vo.setCustName("Venkateswarlu");
		vo.setCustAddrs("Madanapalle");
		vo.setBillAmt("112.3");

		try {
			System.out.println(ctr.processData(vo));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
