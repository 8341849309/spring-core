package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("dhl")
public class DHL implements ICourier {

	public DHL() {
		System.out.println("DHL.DHL()");
	}
	
	public String deliver(int oid) {
		return "DHL.deliver::"+oid+" product is delivered";
	}

}
