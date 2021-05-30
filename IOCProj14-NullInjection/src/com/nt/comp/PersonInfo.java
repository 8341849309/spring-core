package com.nt.comp;

import java.util.Date;

public class PersonInfo {
	private String pname;
	private String addrs;
	private Date dob;
	private Date dom;
	private Date doj;

	public PersonInfo(String pname, String addrs, Date dob, Date dom, Date doj) {
		System.out.println("PersonInfo:: 5-param constructor");
		this.pname = pname;
		this.addrs = addrs;
		this.dob = dob;
		this.dom = dom;
		this.doj = doj;
	}

	@Override
	public String toString() {
		return "PersonInfo [pname=" + pname + ", addrs=" + addrs + ", dob=" + dob + ", dom=" + dom + ", doj=" + doj
				+ "]";
	}

}
