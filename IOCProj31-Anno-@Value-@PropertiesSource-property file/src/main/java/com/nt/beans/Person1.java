package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component("per1")
@ToString
public class Person1 {

	@Value("${per.id}")
	private int pid;
	@Value("${per.name}")
	private String pname;
	@Value("${per.age}")
	private float age;
	
	@Value("${os.name}")
	private String os;
	@Value("${Path}")
	private String path;
	
}
