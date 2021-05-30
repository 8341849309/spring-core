package com.nt.vehicle;

import com.nt.comp.IEngine;

public class Vehicle {
	private IEngine eng;

	public Vehicle(IEngine eng) {
		System.out.println("Vehicle(-)::1-param");
		this.eng=eng;
	}
	
	public void move(String startPlace, String destPlace) {
		eng.start();
		System.out.println(eng.getClass()+" started at "+startPlace);
		eng.stop();
		System.out.println(eng.getClass()+" stopped at "+destPlace);
	}
}
