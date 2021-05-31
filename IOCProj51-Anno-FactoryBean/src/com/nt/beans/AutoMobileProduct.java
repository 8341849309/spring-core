package com.nt.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class AutoMobileProduct extends Product {
	@NonNull
	private String model;
	private int engineCC;

}
