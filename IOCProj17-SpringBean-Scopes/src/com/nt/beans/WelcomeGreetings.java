package com.nt.beans;

public class WelcomeGreetings {
	
	static {
		System.out.println("WelcomeGreetings.static block...");
	}
	
	public WelcomeGreetings() {
		System.out.println("WelcomeGreetings.Constructor(0-param)");
	}

	public void welcome(String user) {
		System.out.println("Welcome to Spring Programming:: "+user);
	}
	
}
