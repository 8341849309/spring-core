package com.nt.dto;

public class ProductDTO {
	private String pName;
	private String type;
	private float basePrice;
	private String status;
	private int quantity;
	
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
	@Override
	public String toString() {
		return "ProductBO [pName=" + pName + ", type=" + type + ", basePrice=" + basePrice
				+ ", status=" + status + ", quantity=" + quantity + "]";
	}


}
