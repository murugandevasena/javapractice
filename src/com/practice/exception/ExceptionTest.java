package com.practice.exception;

public class ExceptionTest {
	public static void main(String[] args) throws BrandException, ArrayIndexOutOfBoundsException{
		
		try {
			System.out.println("Brand is there.");
			throw new BrandException("Brand is not there");
		}
		finally {
			System.out.println("Brand exception");
		}
	}
}
