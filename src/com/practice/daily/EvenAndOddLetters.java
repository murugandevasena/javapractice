package com.practice.daily;

public class EvenAndOddLetters {
	public static void main(String[] args) {
		String g[] = {"murugan","raj","ramalin","Boopathi"};
		for(int i=0;i< g.length;i++) {
			int c = g[i].length()/2;
			if(g[i].length()%2==0) {
				System.out.println(g[i].charAt(c-1)+""+g[i].charAt(c));
			}
			else {
				System.out.println(g[i].charAt(c));
			} 
		}
	}

}
