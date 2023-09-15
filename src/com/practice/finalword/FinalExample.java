package com.practice.finalword;

public class FinalExample {
	public static void main(String[] args) {
		
		FinalExample finalExample = new FinalExample();
		System.out.println(finalExample.hashCode());
		finalExample = new FinalExample();
		System.out.println(finalExample.hashCode());
		System.gc();
	}
	
	@Override
	public void finalize() {
		System.out.println("collected");
	}

}
