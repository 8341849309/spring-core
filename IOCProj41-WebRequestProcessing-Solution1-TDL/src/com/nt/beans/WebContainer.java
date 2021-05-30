package com.nt.beans;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class WebContainer {

	private String beanId;

	public WebContainer(String beanId) {
		System.out.println("WebContainer.WebContainer(-)");
		this.beanId = beanId;
	}

	public void handleRequest(String data) {
		System.out.println("WebContainer ::request came for processing with data::" + data + "---->" + this.hashCode());
		
		//Dependency Look up
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		RequestHandler rh=factory.getBean(beanId,RequestHandler.class);
		
		rh.processRequest(data);
		
		System.out.println("WebContainer :: request processing completed with data::" + data);
	}

}
