package com.nt.test;

import java.sql.SQLException;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.CustomerController;
import com.nt.vo.CustomerVO;

public class LayeredAppTest_BF {

	public static void main(String[] args) {

		//parent IOC container
		DefaultListableBeanFactory pfactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader preader = new XmlBeanDefinitionReader(pfactory);
		preader.loadBeanDefinitions("com/nt/cfgs/business-beans.xml");

		//child IOC container
		DefaultListableBeanFactory cfactory=new DefaultListableBeanFactory(pfactory);
		XmlBeanDefinitionReader creader=new XmlBeanDefinitionReader(cfactory);
		creader.loadBeanDefinitions("com/nt/cfgs/presentation-beans.xml");
		
		CustomerController ctr = cfactory.getBean("controller", CustomerController.class);

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
	}

}
