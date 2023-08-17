package com.practice.exception;

public class ExceptionPractice {
	public static void main(String[] args) {
		// ArithmaticException
//		try {
//			int a =10;
//			int b =0;
//			int c = a/b;
//			System.out.println(c);	
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		finally {
//			System.out.println("There is arithmatic input error. Kindly correct it.");
//		}

		// ArrayIndexOutOfBoundException
//		try {
//			int[] a = { 1, 2, 3 };
//			for (int i = 0; i <= a.length; i++) {
//				System.out.println(a[i]);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			System.out.println("Index possition crosssing the existing limit.");
//		}
		
		

		// NumberFormatException
//		try {
//			String s = "1326589741236";
//			int a = Integer.parseInt(s);
//			System.out.println(a);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			System.out.println("Check the input object.");
//		}
		
		//NullPointerException
		
		String a =null;
		try {
			if(a.equals("ddd")) {
				System.out.println("same");
			} else {
				System.out.println("not same");
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
		finally {
			System.out.println("No primitive not have any value.");
		}
		
		
		
	}
}
