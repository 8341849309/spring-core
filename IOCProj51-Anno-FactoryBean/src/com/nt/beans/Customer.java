package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("cust")
public class Customer {
	
	@Autowired
	private Product prod;

	public Customer() {
		System.out.println("Customer.0-param constructor");
	}

	public  void showProductDetials() {
		if(prod!=null)
		   System.out.println(prod);
		else
			System.out.println("No Product is recieved");
	}
}
