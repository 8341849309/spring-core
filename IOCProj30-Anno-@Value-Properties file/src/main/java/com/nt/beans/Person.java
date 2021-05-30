package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component("per")
@ToString
public class Person {

	@Value("101")
	private int pid;
	@Value("Venkateswarlu")
	private String pname;
	@Value("22.0417")
	private float age;
}
