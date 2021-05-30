package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("bDart")
public class BlueDart implements ICourier {

	public BlueDart() {
		System.out.println("BlueDart.BlueDart()");
	}
	
	public String deliver(int oid) {
		return "BlueDart.deliver::"+oid+" product is delivered";
	}
	
}
