package com.practice.hashtable;

import java.util.Hashtable;

public class HashTablePractice {
	public static void main(String[] args) {
		Hashtable<String, String> h = new Hashtable<String, String>();
		h.put("1", "murugan");
		h.put("2", "ram");
		h.put("3", "raja");
		h.put("4", "uthaman");
		
		
		for(String x:h.keySet()) {
			System.out.println(x.hashCode()%11+" "+x+" "+h.get(x));
		}
	}

}


//It is non-synchronized , which meant not thread safe.
 //Initial default capacity is 11.

//It does not allow null value key and value