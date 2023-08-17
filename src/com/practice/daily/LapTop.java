package com.practice.daily;

public class LapTop {
	private String brand;
	private int price;
	private int ram;
	private Processor processor;
	private Display display;
	
	
	
	public LapTop(String brand, int price, int ram, Processor processor, Display display) {
		super();
		this.brand = brand;
		this.price = price;
		this.ram = ram;
		this.processor = processor;
		this.display = display;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public Processor getProcessor() {
		return processor;
	}
	public void setProcessor(Processor processor) {
		this.processor = processor;
	}
	public Display getDisplay() {
		return display;
	}
	public void setDisplay(Display display) {
		this.display = display;
	}
	@Override
	public String toString() {
		return "LapTop [brand=" + brand + ", price=" + price + ", ram=" + ram + ", processor=" + processor
				+ ", display=" + display + "]";
	}
	
	
	
	
	
	

}
