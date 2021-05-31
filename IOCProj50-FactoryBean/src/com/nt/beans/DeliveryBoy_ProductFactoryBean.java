package com.nt.beans;

import org.springframework.beans.factory.FactoryBean;

public class DeliveryBoy_ProductFactoryBean implements FactoryBean<Product>{

	private String prodType;

	public DeliveryBoy_ProductFactoryBean(String prodType) {
		System.out.println("DeliverBoy_ProductFactoryBean:: 1-param constructor");
		this.prodType=prodType;
	}

	@Override
	public Product getObject() throws Exception {
		System.out.println("DeliveryBoy_ProductFactoryBean.getObject()");
		
		
		if(prodType.equalsIgnoreCase("electronic")) 
			return new ElectronicProduct("5v","5*");
		else if(prodType.equalsIgnoreCase("automobile"))
			return new AutoMobileProduct("Sujuki",120);
		else
			return null;
		
	}

	@Override
	public Class<Product> getObjectType() {
		System.out.println("DeliveryBoy_ProductFactoryBean.getObjectType()");
		return Product.class;
	}

	
}
