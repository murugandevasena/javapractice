package com.practice.daily;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveRepeatedStringWords {
	public static void main(String[] args) {
		String a = "This is me and This is my House This is me native This".toLowerCase();
		int flag = 0;
		//Using for loop.
		String[] g = a.split(" ");
		for(int i=0;i<g.length;i++) {
			for(int j=i+1;j<g.length;j++) {
				if(g[i].equals(g[j])) {
					flag++;
					g[i]="";
					g[j]="";
				}
			}
			if(flag>0) {
				System.out.print(g[i]  +" ");
			}
		}
		
		//Another way of doing using LinkedhashSet 
		LinkedHashSet<String> hashSet = new LinkedHashSet<String>();
		for(int  i=0;i<g.length;i++) {
			hashSet.add(g[i]);
		}
		System.out.println(hashSet);
	}
}
