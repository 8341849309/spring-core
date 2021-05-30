package com.nt.beans;

public class BlueDart implements ICourier {

	public BlueDart() {
		System.out.println("BlueDart.BlueDart()");
	}
	
	public String deliver(int oid) {
		return "BlueDart.deliver::"+oid+" product is delivered";
	}
	
}
