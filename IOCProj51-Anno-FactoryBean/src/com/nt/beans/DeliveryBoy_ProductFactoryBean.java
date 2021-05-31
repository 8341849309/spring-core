package com.nt.beans;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("dbpf")
@PropertySource(value = "com/nt/commons/info.properties")
public class DeliveryBoy_ProductFactoryBean implements FactoryBean<Product>{

	@Value("${prod.type}")
	private String prodType;

	public DeliveryBoy_ProductFactoryBean() {
		System.out.println("DeliverBoy_ProductFactoryBean:: 0-param constructor");
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
