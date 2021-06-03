package com.nt.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "info.per")
public class Person {
	private int id;
	private String name;
	
	// array/list/set
	private int[] marks;
	private List<String> nickNames;
	private Set<Long> phoneNums;
	
	// Map/properties
	private Map<String, Long> idCards;
	private Properties favFruits;
	
	// Has-A property
	private Address address;
	
}
