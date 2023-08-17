package com.practice.multipleinheritance;

public class SportsCar extends Car {
	
	private int topSpeed;
	private int hp;
	
	


	public SportsCar(String brand, int price, String model, int topSpeed, int hp) {
		super(brand, price, model);
		this.topSpeed = topSpeed;
		this.hp = hp;
	}




	@Override
	public String toString() {
		return super.toString()+", SportsCar [topSpeed=" + topSpeed + ", hp=" + hp + "]";
	}


	

	

	
	

}
