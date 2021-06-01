package com.nt.beans;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;

public class PersonalInfo {
	private String name;
	private float age;
	private int luckyNum;
	private Date dob;
	private String[] moles;
	private byte[] academicPercentages;
	private long adharNo;
	private char favChar;
	private File fileLocation;
	private Locale favLocale;
	private URL fbUrl;
	private Class favClass;
	private Properties props;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(float age) {
		this.age = age;
	}

	public void setLuckyNum(int luckyNum) {
		this.luckyNum = luckyNum;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public void setMoles(String[] moles) {
		this.moles = moles;
	}

	public void setAcademicPercentages(byte[] academicPercentages) {
		this.academicPercentages = academicPercentages;
	}

	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}

	public void setFavChar(char favChar) {
		this.favChar = favChar;
	}

	public void setFileLocation(File fileLocation) {
		this.fileLocation = fileLocation;
	}

	public void setFavLocale(Locale favLocale) {
		this.favLocale = favLocale;
	}

	public void setFbUrl(URL fbUrl) {
		this.fbUrl = fbUrl;
	}

	public void setFavClass(Class favClass) {
		this.favClass = favClass;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	@Override
	public String toString() {
		return "PersonalInfo [name=" + name + ", age=" + age + ", luckyNum=" + luckyNum + ", dob=" + dob + ", moles="
				+ Arrays.toString(moles) + ", academicPercentages=" + Arrays.toString(academicPercentages)
				+ ", adharNo=" + adharNo + ", favChar=" + favChar + ", fileLocation=" + fileLocation + ", favLocale="
				+ favLocale + ", fbUrl=" + fbUrl + ", favClass=" + favClass + ", props=" + props + "]";
	}

}
