package com.practice.companyinterviewquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class StringCount {
	public static void main(String[] args) {
		String g ="Java C++ C Python AWS Ruby Java Sql MySql AWS AWS";
		String g1 = g.toLowerCase();
		String[] g2 = g1.split(" ");
//		
//		for(int i=0;i<g2.length;i++) {
//			int count=1;
//			for(int j=i+1;j<g2.length;j++) {
//				if(g2[i].equals(g2[j])) {
//					count++;	
//					
//				}
//			}
//			System.out.println(g2[i]+" "+count);
//		}
		
		//Using set
		List<String> list = Arrays.asList(g1.split(" "));
	    Set<String> uniqueWords = new HashSet<String>(list);
	    System.out.println("Unique words:"+ uniqueWords);
	    
	    for (String word : uniqueWords) {
	        System.out.println(word + ": " + Collections.frequency(list, word));
	    }
		
		//Using stream
	    HashSet<String> hashSet = new HashSet<String>(list);
	    list.stream().filter(z-> Collections.frequency(list,z)>1).distinct().forEach(u->System.out.print(u+" "));
	    
	
		
		List<String> l1 = new ArrayList<String>();
		for(int k=0;k<g2.length;k++) {
			l1.add(g2[k]);
		}
		//System.out.println(l1);
		

		
		
	
	}
}
