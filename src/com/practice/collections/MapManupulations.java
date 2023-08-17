package com.practice.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapManupulations {
	public static void main(String[] args) {
		
		HashMap<Integer, Integer> h =new HashMap<Integer, Integer>();
		h.put(1, 100);
		h.put(2, 200);
		h.put(4, 300);
		h.put(3, 400);
		h.put(5, 500);
		h.put(6, 600);
		System.out.println(h);
		for(int i=0;i<h.size();i++) {
			//h.remove(1);
			System.out.println(h);
		}
		System.out.println("Size of map:"+h.size());
		System.out.println(h.containsValue(200));
		System.out.println(h.containsKey(2));
		System.out.println(h.replace(1, 100, 1000));
		System.out.println(h);
		
		LinkedHashMap<Integer, Integer> li = new LinkedHashMap<Integer, Integer>();
		li.put(1, 2);
		li.put(2, 3);
		li.put(3, 4);
		li.put(1, 7);
		System.out.println(li);

//		HashMap<Integer, Integer> h1 =new HashMap<Integer, Integer>();
//		h1.put(1, 100);
//		h1.put(2, 200);
//		h1.put(4, 300);
//		h1.put(3, 400);
//		h1.put(5, 500);
//		h1.put(6, 600);
//		
//		for(Integer i: h1.keySet()) {
//			h1.remove(i);
//		}
		
		
		// ConcurrentHashMap is used to avoid the exception while removing the during the itreation. 
		ConcurrentHashMap<Integer, Integer> h2 =new ConcurrentHashMap<Integer, Integer>();
		h2.put(1, 100);
		h2.put(2, 200);
		h2.put(4, 300);
		h2.put(3, 400);
		h2.put(5, 500);
		h2.put(6, 600);
		
		for(Integer i: h2.keySet()) {
			h2.remove(i);
		}
		System.out.println(h2);
		
		
	}

}
