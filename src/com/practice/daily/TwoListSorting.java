package com.practice.daily;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class TwoListSorting {
	public static void main(String[] args) {

//		Map<Integer,String> map = new HashMap<Integer, String>();
//		map.put(0, "a");
//		map.put(1, "b");
//		map.put(0, "c");
//		map.put(2, "d");
//		map.put(3, "f");
//		map.put(3, "g");
//		map.put(4, "h");
//		map.put(4, "j");
//		map.put(5, "k");
//		
//		for(Map.Entry<Integer, String> entry:map.entrySet()) {
//			System.out.println(entry);
//		}

		List<String> l1 = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h");
		List<Integer> l2 = Arrays.asList(0, 1, 1, 0, 1, 2, 2, 0);

		Map<Integer, String> m = new HashMap<Integer, String>();
		for (int i = 0; i < l2.size(); i++) {
			for (int j = 0; j < l1.size(); j++) {
				m.put(l2.get(i), l1.get(i));
			}
		}
		// Enhanced for loop

		for (Map.Entry<Integer, String> entry : m.entrySet()) {
			for (int k = 0; k < l2.size(); k++) {
				if (entry.getKey() == l2.get(k)) {
					System.out.println(entry.getKey() + " " + l1.get(k));
				}

			}
		}
		
		
		//another method
		
		int [] c= {0,1,2};
		
		for(int j=0;j<c.length;j++) {
			for(int g=0;g<l2.size();g++ ) {
				if(c[j]==l2.get(g)) {
					System.out.print(l1.get(g));
					
				}
			}
		}

		
//		//forEach loop
//		
//		m.forEach((k,v)->System.out.println(k+" "+v));

//		List<Entry<Integer, String>> m1 = m.entrySet().stream().filter(x -> x.getKey() == 2)
//				.collect(Collectors.toList());
//		System.out.println(m1);

	}
}
