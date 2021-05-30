package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {

	private Date date;

	static {
		System.out.println("static block");
	}

	public WishMessageGenerator() {
		System.out.println("Constructor()");
	}

	public void setDate(Date date) {
		System.out.println("setDate(-)");
		this.date = date;
	}

	public String generateWishMessage(String user) {
		
		int hour = date.getHours();

		if (hour < 12)
			return "Good Morning:: " + user;
		else if (hour >= 12 && hour < 16)
			return "Good AfterNoon:: " + user;
		else if (hour >= 16 && hour < 18)
			return "Good Evening:: " + user;
		else
			return "Good Night:: " + user;
	}

}
