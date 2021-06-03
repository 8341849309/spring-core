package com.nt.bo;

import java.io.Serializable;

import lombok.Data;

@Data
public class CustomerBO implements Serializable {
	private int custId;
	private String custName;
	private String custAddrs;
	private float billAmt;

}
