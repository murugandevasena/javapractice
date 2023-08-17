package com.practice.daily;

public class ArrayToSingle {
	public static void main(String[] args) {
		int [] a = {10,30,40,56,78};
		/*One way of implmentation
		 * 
		 */
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		
		/*Second way of implmentation
		 * 
		 */
		StringBuffer s = new StringBuffer();
		for(int j:a) {
			s.append(j);
		}
		System.out.println(s);
		
	}
}
