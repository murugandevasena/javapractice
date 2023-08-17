package com.practice.daily;

import java.util.HashMap;
import java.util.Map;

public class RemoveCharFromString {
	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(3, "apple");
		map.put(5, "watermelon");
		map.put(4, "orange");
		map.put(2, "gig");

		
		for (Map.Entry<Integer, String> m : map.entrySet()) {
//			System.out.println(m.getValue());
			StringBuffer sb = new StringBuffer(m.getValue());
			sb.deleteCharAt(m.getKey());
			System.out.println(sb.toString());
			
		}

	}

}
