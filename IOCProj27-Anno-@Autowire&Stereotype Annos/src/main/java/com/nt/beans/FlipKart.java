package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("flipkart")
public class FlipKart {

	@Autowired
	@Qualifier("dhl")
	private ICourier courier;

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
