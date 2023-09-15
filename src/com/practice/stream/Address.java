package com.practice.stream;

public class Address {
	private String zipCode;

	public Address(String zipCode) {
		super();
		this.zipCode = zipCode;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [zipCode=" + zipCode + "]";
	}
	
	

}
