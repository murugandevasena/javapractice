package com.practice.hashcodeequalsoverride;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SampleMap {
	public static void main(String[] args) {
		//Map<Integer,String> val = new HashMap<Integer, String>();
		
		//failSafe
		Map<Integer,String> val = new ConcurrentHashMap<Integer, String>();
		val.put(123, "muruga");
		val.put(124, "raja");
		val.put(125, "Ganguly");
		
		for(Integer i:val.keySet()) {
			val.put(126, "Gill");
		}
		val.values().forEach(x->System.out.println(x));
	}

}
