package com.nt.dto;

import lombok.Data;

@Data
public class CustomerDTO {
	private int custId;
	private String custName;
	private String custAddrs;
	private float billAmt;

}
