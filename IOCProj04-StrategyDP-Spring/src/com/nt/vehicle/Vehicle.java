package com.nt.vehicle;

import com.nt.comp.IEngine;

public class Vehicle {
	private IEngine eng;

	public void setEng(IEngine eng) {
		this.eng = eng;
	}
	
	public void move(String startPlace, String destPlace) {
		eng.start();
		System.out.println(eng.getClass()+" started at "+startPlace);
		eng.stop();
		System.out.println(eng.getClass()+" stopped at "+destPlace);
	}
}
