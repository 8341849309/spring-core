package com.nt.beans;

public class DHL implements ICourier {

	public DHL() {
		System.out.println("DHL.DHL()");
	}
	
	public String deliver(int oid) {
		return "DHL.deliver::"+oid+" product is delivered";
	}

}
