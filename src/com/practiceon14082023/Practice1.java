package com.practiceon14082023;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Practice1 {
	public static void main(String[] args) {
		String a ="Balaji";
	    StringBuilder sb= new StringBuilder(a);
	    System.out.println(sb.reverse());
	    int count=0;
	    for(int j=0;j<sb.length();j++) {
	    	if(sb.charAt(j)=='a') {
	    		count++;
	    	}
	    }
	    System.out.println(count);	
	}

}
