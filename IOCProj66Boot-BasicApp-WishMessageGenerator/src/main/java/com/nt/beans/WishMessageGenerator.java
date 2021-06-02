package com.nt.beans;


import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wMsg")
public class WishMessageGenerator {
	
	@Autowired
	private LocalDateTime date;

	static {
		System.out.println("static block");
	}

	public WishMessageGenerator() {
		System.out.println("Constructor()");
	}

	public String generateWishMessage(String user) {

		int hour = date.getHour();

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
