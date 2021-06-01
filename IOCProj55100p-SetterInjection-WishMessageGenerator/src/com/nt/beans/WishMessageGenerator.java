package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("wMsg")
public class WishMessageGenerator {

	@Autowired
	@Qualifier("dt")
	private Date date;

	static {
		System.out.println("static block");
	}

	public WishMessageGenerator() {
		System.out.println("Constructor()");
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
