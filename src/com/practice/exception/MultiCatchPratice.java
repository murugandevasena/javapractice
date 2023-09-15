package com.practice.exception;

public class MultiCatchPratice {
	public static void main(String[] args) {
		
		String[] g= {"sun","moon","star"};
		int a = 10;
		int b=0;
		String s = "muru";
		try {
			System.out.println(a/b);
			for(int i=0;i<=g.length;i++) {
				System.out.println(g[i].substring(1, 3));
			}
			System.out.println(s.charAt(10));
			
		}
		catch (ArrayIndexOutOfBoundsException i) {
			System.out.println("Index length is started form 0 index.");
			System.out.println(i);
		}
		catch (ArithmeticException ar) {
			System.out.println("Aritmaitic exception");
		}
		catch (RuntimeException r) {
			System.out.println(r);
		}
		finally {
			System.out.println("Try to focus size of an string array.");
		}
	}

}
