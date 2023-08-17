package com.practice.encapulation;

public class Encapu1 {
	
	private int length;
	private int breath;
	
	
	
	public Encapu1(int length, int breath) {
		super();
		this.length = length;
		this.breath = breath;
	}
//	public int getLength() {
//		return length;
//	}
////	public void setLength(int length) {
////		this.length = length;
////	}
//	public int getBreath() {
//		return breath;
//	}
//	public void setBreath(int breath) {
//		this.breath = breath;
//	}
	
	public void area() {
		int z=length*breath;
		System.out.printf("Area:" +z);
	}
}
