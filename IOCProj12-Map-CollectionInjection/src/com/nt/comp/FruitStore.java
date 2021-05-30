package com.nt.comp;

import java.util.Date;
import java.util.Map;

public class FruitStore {

	private Map<String, Float> fruitsInfo;
	private Map<String, Date> impDates;

	public void setFruitsInfo(Map<String, Float> fruitsInfo) {
		this.fruitsInfo = fruitsInfo;
	}

	public void setImpDates(Map<String, Date> impDates) {
		this.impDates = impDates;
	}

	public void process() {
		System.out.println(fruitsInfo.get("Banana"));
	}
	
	@Override
	public String toString() {
		return "FruitStore [fruitsInfo=" + fruitsInfo.getClass() + fruitsInfo + ", impDates=" + impDates + "]";
	}

}
