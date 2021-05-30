package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

import javax.annotation.Resource;
import javax.inject.Named;

@Named("flipkart")
public class FlipKart {

	@Resource(name = "bDart")
	private ICourier courier;

	// @Resource(name = "dtdc")
	public void setCourier(ICourier courier) {
		this.courier = courier;
	}

	public String shopping(String items[], Float prices[]) {

		float billAmt = 0.0f;

		for (Float p : prices) {
			billAmt += p;
		}

		// Generate Order id
		int oid = new Random().nextInt(10000);

		String msg = courier.deliver(oid);

		String finalMsg = Arrays.toString(items) + " are shopped having prices " + Arrays.toString(prices)
				+ " with bill amount:: " + billAmt + " " + msg;

		return finalMsg;
	}
}
