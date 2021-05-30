package com.nt.bo;

public class ProductBO {
	private int pId;
	private String pName;
	private String type;
	private float basePrice;
	private String status;
	private int quantity;
	private double MRP;

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(float basePrice) {
		this.basePrice = basePrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getMRP() {
		return MRP;
	}

	public void setMRP(double mRP) {
		MRP = mRP;
	}

	@Override
	public String toString() {
		return "ProductBO [pId=" + pId + ", pName=" + pName + ", type=" + type + ", basePrice=" + basePrice
				+ ", status=" + status + ", quantity=" + quantity + ", MRP=" + MRP + "]";
	}

}
