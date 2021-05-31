package com.nt.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class ElectronicProduct extends Product {
	@NonNull
	private String voltage;
	@NonNull
	private String starRating;
	
}
