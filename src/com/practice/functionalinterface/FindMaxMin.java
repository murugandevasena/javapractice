package com.practice.functionalinterface;

public class FindMaxMin {
	public static void main(String[] args) {
		MaxMin min = (a)->{
			String m=a[0];
			for(int i=0; i<a.length; i++) {
				if(m.length()>a[i].length()) {
					m = a[i];
				}	
			}
			return m;	
		};
			
			MaxMin x = (b)->{
			String max =b[0];
			for(int i=0; i<b.length;i++) {
				if(max.length()<b[i].length()) {
					max = b[i];
				}	
			}
			return max;	
		};
	
		String [] s = {"my","name","is","murugan"};
		System.out.println(min.find(s));
		System.out.println(x.find(s));
	} 

}
