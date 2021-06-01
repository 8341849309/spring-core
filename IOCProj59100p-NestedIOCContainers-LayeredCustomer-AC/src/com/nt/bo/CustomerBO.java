package com.nt.bo;

public class CustomerBO {
	private int custId;
	private String custName;
	private String custAddrs;
	private float billAmt;

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAddrs() {
		return custAddrs;
	}

	public void setCustAddrs(String custAddrs) {
		this.custAddrs = custAddrs;
	}

	public float getBillAmt() {
		return billAmt;
	}

	public void setBillAmt(float billAmt) {
		this.billAmt = billAmt;
	}

	@Override
	public String toString() {
		return "CustomerBO [custId=" + custId + ", custName=" + custName + ", custAddrs=" + custAddrs + ", billAmt="
				+ billAmt + "]";
	}

}
