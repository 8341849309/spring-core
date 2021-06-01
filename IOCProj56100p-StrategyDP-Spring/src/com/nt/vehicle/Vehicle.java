package com.nt.vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nt.comp.IEngine;

@Component("vehicle")
public class Vehicle {
	
	@Autowired
	@Qualifier("electric")
	private IEngine eng;
	
	public void move(String startPlace, String destPlace) {
		eng.start();
		System.out.println(eng.getClass()+" started at "+startPlace);
		eng.stop();
		System.out.println(eng.getClass()+" stopped at "+destPlace);
	}
}
