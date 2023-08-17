package com.practice.multipleinheritance;

public class Car implements AutoMobile,RoadwayTransport {
	private String brand;
	private int price;
	private String model;

	
	
	public Car(String brand, int price, String model) {
		super();
		this.brand = brand;
		this.price = price;
		this.model = model;
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
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", model=" + model + "]";
	}
	
	
	@Override
	public String noPassengers(int seats) {
		// TODO Auto-generated method stub
		return "NoOfSeats:"+seats;
	}
	@Override
	public int calculateMileage(boolean isPetrol) {
		// TODO Auto-generated method stub
		int b;
		if(isPetrol==true) {
			b=25;
		}
		else {
			b=12;
		}
		return b;
	}
	@Override
	public String vehicleType() {
		// TODO Auto-generated method stub
		return "SuperCar";
	}
	
	
	
	

}
