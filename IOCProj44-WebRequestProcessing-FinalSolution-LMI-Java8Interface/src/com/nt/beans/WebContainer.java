package com.nt.beans;

public interface WebContainer {

	public RequestHandler getHandler();

	default void handleRequest(String data) {
		System.out.println("WebContainer ::request came for processing with data::" + data + "---->" + this.hashCode());

		RequestHandler rh = getHandler();
		rh.processRequest(data);

		System.out.println("WebContainer :: request processing completed with data::" + data);
	}

}
