package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

import javax.inject.Inject;
import javax.inject.Named;

@Named("flipkart")
public class FlipKart {

/*	@Inject
	@Named("dhl")	*/
	private ICourier courier;
	
	
/*	@Inject
	@Named("dhl")	*/
	public void setCourier(ICourier courier) {
		this.courier = courier;
	}

	@Inject
	@Named("dhl")
	public FlipKart(ICourier courier) {
		this.courier=courier;
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
