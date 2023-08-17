package com.practice.daily;

public class Palindrome {
	public static void main(String[] args) {
		String g="malayalam"; 
		
		//Before checking polindrome, we need ensure all the characters should be either lowerCase or Uppercase.
		//String g =h.toUpperCase();
		String r ="";
		for(int i=g.length()-1;i>=0;i--) {
			r =r+g.charAt(i); 
		}
		if(r.equals(g)) {
			System.out.println("it is palindroome.");
		} else
			System.out.println("it is not palindrome.");
		
		
	}

}
