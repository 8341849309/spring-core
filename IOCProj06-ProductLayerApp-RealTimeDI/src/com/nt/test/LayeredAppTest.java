package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.ProductVO;

public class LayeredAppTest {

	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");

		MainController ctr = factory.getBean("controller", MainController.class);

		try {
			ProductVO vo=new ProductVO();
			vo.setpName("Shirt");
			vo.setQuantity("2");
			vo.setBasePrice("70");
			vo.setStatus("Available");
			vo.setType("Jeans");
			
			System.out.println(ctr.processData(vo));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
