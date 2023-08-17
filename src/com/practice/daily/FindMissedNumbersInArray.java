package com.practice.daily;

public class FindMissedNumbersInArray {
	public static void main(String[] args) {
		int [] a = {1,2,4,5,7,8};
		for(int i=1;i<15;i++) {
			int c =0;
			for(int j=0;j<a.length;j++) {
				
				if(i==a[j]) {
					c++;
				}	
			}
			if(c==0) {
				System.out.println(i);
			}
		}
	}

}
