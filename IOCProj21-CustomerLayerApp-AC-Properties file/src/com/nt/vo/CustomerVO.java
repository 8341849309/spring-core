package com.nt.vo;

public class CustomerVO {
	private String custId;
	private String custName;
	private String custAddrs;
	private String billAmt;

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
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

	public String getBillAmt() {
		return billAmt;
	}

	public void setBillAmt(String billAmt) {
		this.billAmt = billAmt;
	}

	@Override
	public String toString() {
		return "CustomerVO [custId=" + custId + ", custName=" + custName + ", custAddrs=" + custAddrs + ", billAmt="
				+ billAmt + "]";
	}

}
