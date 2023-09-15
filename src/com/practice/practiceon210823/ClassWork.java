package com.practice.practiceon210823;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassWork {
	public static void main(String[] args) {

		// Possible combinations
		List<Integer> ls = Arrays.asList(2, 7, 5, 3);
		long s = ls.stream().flatMap(x->ls.stream().filter(y->x+y==5 && x>y||x<y).map(y->x+" "+y)).count();
		System.out.println(s);
		//long a=list.stream().flatMap(i->list.stream().filter(j->i+j==8 && i>j).map(j->i+","+j)).count();
		// String reverse

//		String a = "abc123decr";
//		String a1="";
//		for (int i = a.length() - 1; i >= 0; i--) {
//			if (a.charAt(i) == '1') {
//				continue;
//			}
//			System.out.print(a1+a.charAt(i));
//		}

		// remove characters from string
//		Map<Integer, String> map = new HashMap<Integer, String>();
//		map.put(3, "apple");
//		map.put(5, "watermelon");
//		map.put(10, "orange");
//		map.put(2, "gig");
//
//		for (Map.Entry<Integer, String> m : map.entrySet()) {
////			System.out.println(m.getValue());
//			StringBuffer sb = new StringBuffer(m.getValue());
//			if(m.getKey()==3) {
//				sb.deleteCharAt(m.getKey());
//				System.out.println(sb);
//			}
//			else if(m.getKey()==5) {
//				sb.replace(m.getKey(), 6, "M");
//				System.out.println(sb);
//			}
//			else if(m.getKey()==10) {
//				System.out.println(m.getValue());
//			}
//			else if(m.getKey()==2) {
//				sb.deleteCharAt(m.getKey());
//				System.out.println(sb);
//			}	
//		}
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("3", "apple");
		map.put("5", "watermelon");
		map.put("10", "orange");
		map.put("2", "gig");

		for (Map.Entry<String, String> m : map.entrySet()) {
//			System.out.println(m.getValue());
			StringBuffer sb = new StringBuffer(m.getValue());
			if(m.getKey()=="3") {
				sb.deleteCharAt(Integer.parseInt(m.getKey()));
				System.out.println(sb);
			}
			else if(m.getKey()=="5") {
				sb.replace(Integer.parseInt(m.getKey()), 6, "M");
				System.out.println(sb);
			}
			else if(m.getKey()=="10") {
				System.out.println(m.getValue());
			}
			else if(m.getKey()=="2") {
				sb.deleteCharAt(Integer.parseInt(m.getKey()));
				System.out.println(sb);
			}	
		}


	}

}
