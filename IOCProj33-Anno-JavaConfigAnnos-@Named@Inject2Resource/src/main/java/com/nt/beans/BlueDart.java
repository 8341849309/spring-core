package com.nt.beans;

import javax.inject.Named;

@Named("bDart")
public class BlueDart implements ICourier {

	public BlueDart() {
		System.out.println("BlueDart.BlueDart()");
	}
	
	public String deliver(int oid) {
		return "BlueDart.deliver::"+oid+" product is delivered";
	}
	
}
