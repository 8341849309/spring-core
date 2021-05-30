package com.nt.beans;

public class DTDC implements ICourier {

	public DTDC() {
		System.out.println("DTDC.DTDC()");
	}
	
	public String deliver(int oid) {
		return "DTDC.deliver::"+oid+" product is delivered";
	}

}
