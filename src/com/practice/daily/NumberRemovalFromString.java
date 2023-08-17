package com.practice.daily;

public class NumberRemovalFromString {
	public static void main(String[] args) {
		String a = "abc123def";
		String c= a.replaceAll("\\d", "");
		char[] d = c.toCharArray();
		char temp;
		for(int i=0;i<c.length();i++) {
			for(int j=i+1;j<c.length();j++) {
				if(d[i]<d[j]) {
					temp = d[i];
					d[i]=d[j];
					d[j]=temp;	
				}
			}
			System.out.print(d[i]);
		}
		
		
		// Another way of doing
		
//		String  f ="";
//		for(int k=d.length-1;k>=0;k--) {
//			if(d[k]>='a'&&d[k]<='z') {
//				f=f+d[k];
//			}	
//		}
//		System.out.println(f);
		
		
	}

}
