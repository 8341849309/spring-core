package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("store")
public class Store {
	
	@Autowired
	private Product prod;
	
	public Store() {
		System.out.println("Store.Store()");
	}
	
	public Product showProduct() {
		return prod;
	}
	
}
