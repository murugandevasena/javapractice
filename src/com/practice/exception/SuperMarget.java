package com.practice.exception;

public class SuperMarget {
	private String brand;
	private int id;
	private String productName;
	public SuperMarget(String brand, int id, String productName) {
		super();
		this.brand = brand;
		this.id = id;
		this.productName = productName;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	

}
