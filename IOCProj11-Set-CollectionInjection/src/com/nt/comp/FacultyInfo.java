package com.nt.comp;

import java.util.Date;
import java.util.Set;

public class FacultyInfo {

	private Set<Long> phoneNums;
	private Set<Date> impDates;

	public void setPhoneNums(Set<Long> phoneNums) {
		this.phoneNums = phoneNums;
	}

	public void setImpDates(Set<Date> impDates) {
		this.impDates = impDates;
	}

	@Override
	public String toString() {
		return "FacultyInfo [phoneNums=" +phoneNums.getClass()+ phoneNums + ", impDates=" + impDates + "]";
	}

}
