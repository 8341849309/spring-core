package com.nt.comp;

public class Student {
	private int rollNo;
	private String name;
	private String addrs;
	private float avgMarks;

	public Student(int rollNo, String name, String addrs, float avgMarks) {
		this.rollNo = rollNo;
		this.name = name;
		this.addrs = addrs;
		this.avgMarks = avgMarks;
	}

	public Student(int rollNo, String name, String addrs) {
		this.rollNo = rollNo;
		this.name = name;
		this.addrs = addrs;
	}

	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", addrs=" + addrs + ", avgMarks=" + avgMarks + "]";
	}

}
