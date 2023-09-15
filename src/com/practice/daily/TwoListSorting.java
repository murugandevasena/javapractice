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

//		List<String> l1 = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h");
//		List<Integer> l2 = Arrays.asList(0, 1, 1, 0, 1, 2, 2, 0);
//
//		Map<Integer, String> m = new HashMap<Integer, String>();
//		for (int i = 0; i < l2.size(); i++) {
//			//for (int j = 0; j < l1.size(); j++) {
//				m.put(l2.get(i), l1.get(i));
//			//}
//		}
//		// Enhanced for loop
//
//		for (Map.Entry<Integer, String> entry : m.entrySet()) {
//			for (int k = 0; k < l2.size(); k++) {
//				if (entry.getKey() == l2.get(k)) {
//					System.out.println(entry.getKey() + " " + l1.get(k));
//				}
//
//			}
//		}
		
		
		List<String> l1 = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h");
		List<String> l2 = Arrays.asList("0", "1", "1", "0", "1", "2", "2", "0");

		Map<String, String> m = new HashMap<String, String>();
		for (int i = 0; i < l2.size(); i++) {
			for (int j = 0; j < l1.size(); j++) {
				m.put(l2.get(i), l1.get(i));
			}
		}
		// Enhanced for loop

		for (Map.Entry<String, String> entry : m.entrySet()) {
			for (int k = 0; k < l2.size(); k++) {
				if (entry.getKey() == l2.get(k)) {
					System.out.println(entry.getKey() + " " + l1.get(k));
				}

			}
		}
//		
		//another method
		
//		int [] c= {0,1,2};
//		
//		for(int j=0;j<c.length;j++) {
//			for(int g=0;g<l2.size();g++ ) {
//				if(c[j]==l2.get(g)) {
//					System.out.print(l1.get(g));
//					
//				}
//			}
//		}
//		
		
		
		
		///using list of string
		List<String> l21 = Arrays.asList("01101220");
//		
//		
//		String f = l21.get(0);
//		int [] nw = new int[f.length()];
//		char [] p  = f.toCharArray();
//		
//		for (int j = 0; j < f.length(); j++) {
//            nw[j] = (int)p[j];
//          
//        }
//	
//		
//		Map<Integer, String> m1 = new HashMap<Integer, String>();
//		//System.out.println(l21.length());
//		for(int u=0;u<nw.length;u++) {
//			for(int u1=0;u1<l1.size();u1++) {
//				m1.put(nw[u], l1.get(u));
//			}
//		}
//		
//		for (Map.Entry<Integer, String> entry1 : m1.entrySet()) {
//			for (int k1 = 0; k1 < l2.size(); k1++) {
//				if (entry1.getKey() == l2.get(k1)) {
//					System.out.println(entry1.getKey() + "-" + l1.get(k1));
//				}
//
//			}
//		}
	}
	
}
