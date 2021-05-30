package com.nt.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("rh")
@Scope("prototype")
public class RequestHandler {

	private static int count=0;
	
	public RequestHandler() {
		count++;
		System.out.println("RequestHandler.RequestHandler():: "+count);
	}
	
	public void processRequest(String data) {
		System.out.println("Request Handler:: processing data"+data+this.hashCode()+"..."+count);
	}
}
