package com.practice.functionalinterface;

public class FindTheCharacters {
 
	static String a = "muruganranlingan";
	public static void main(String[] args) {
		Demo d = (a)->{
			for(int i=0;i<a.length();i++) {
				if(a.charAt(i)=='n') {
					System.out.println(a.charAt(i));
				}
			}
			
		};
	d.name(a);
		
	}


}
