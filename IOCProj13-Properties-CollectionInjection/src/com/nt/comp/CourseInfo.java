package com.nt.comp;

import java.util.Properties;

public class CourseInfo {
	private Properties courseDetails;

	public void setCourseDetails(Properties courseDetails) {
		this.courseDetails = courseDetails;
	}

	@Override
	public String toString() {
		return "CourseInfo [courseDetails=" + courseDetails.getClass() + courseDetails + "]";
	}

}
