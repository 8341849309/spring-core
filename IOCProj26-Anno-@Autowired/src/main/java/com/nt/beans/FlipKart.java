package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class FlipKart {

	//peoperty level autowiring
	//@Autowired
	//@Qualifier("bDart")
	private ICourier courier;
	
	//Autowiring on setter method
/*	@Autowired
	@Qualifier("bDart")
	public void setCourier(ICourier courier) {
		this.courier = courier;
	}
*/
	/*
	//Autowiring on orbitary method
	@Autowired
	@Qualifier("bDart")
	public void assign(ICourier cr) {
		this.courier=cr;
		System.out.println("FlipKart.assign()");
	}
	*/
	@Autowired
	public FlipKart(@Qualifier("bDart") ICourier courier) {
		this.courier=courier;
		System.out.println("FlipKart.FlipKart(-)");
	}

	public String shopping(String items[], Float prices[]) {

		float billAmt = 0.0f;
		
		for (Float p : prices) {
			billAmt += p;
		}
		
		// Generate Order id
		int oid = new Random().nextInt(10000);

		String msg=courier.deliver(oid);
		
		String finalMsg = Arrays.toString(items) + " are shopped having prices " + Arrays.toString(prices)
				+ " with bill amount:: " + billAmt + " " + msg;
		
		return finalMsg;
	}
}
