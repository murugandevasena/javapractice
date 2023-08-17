package com.practice.daily;

public class Processor {
	private String brand;
	private String generation;
	private int price;
	public Processor(String brand, String generation, int price) {
		super();
		this.brand = brand;
		this.generation = generation;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getGeneration() {
		return generation;
	}
	public void setGeneration(String generation) {
		this.generation = generation;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Processor [brand=" + brand + ", generation=" + generation + ", price=" + price + "]";
	}
	

	
}
