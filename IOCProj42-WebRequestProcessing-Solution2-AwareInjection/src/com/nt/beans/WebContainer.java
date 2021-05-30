package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class WebContainer implements BeanFactoryAware {

	private String beanId;
	private BeanFactory factory;

	public WebContainer(String beanId) {
		System.out.println("WebContainer.WebContainer(-)");
		this.beanId = beanId;
	}

	@Override
	public void setBeanFactory(BeanFactory factory) throws BeansException {
		this.factory = factory;
	}

	public void handleRequest(String data) {
		System.out.println("WebContainer ::request came for processing with data::" + data + "---->" + this.hashCode());

		// Dependency Look up
		RequestHandler rh = factory.getBean(beanId, RequestHandler.class);

		rh.processRequest(data);

		System.out.println("WebContainer :: request processing completed with data::" + data);
	}

}
