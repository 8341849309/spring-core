package com.nt.beans;

public abstract class WebContainer {

	public WebContainer() {
		System.out.println("WebContainer.WebContainer() "+this.getClass());
	}

	public abstract RequestHandler getHandler();

	public void handleRequest(String data) {
		System.out.println("WebContainer ::request came for processing with data::" + data + "---->" + this.hashCode());

		RequestHandler rh = getHandler();
		rh.processRequest(data);

		System.out.println("WebContainer :: request processing completed with data::" + data);
	}

}
