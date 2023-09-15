package com.practice.functionalinterface;

import java.util.HashSet;

public class UseStringDuplicate {
	public static void main(String[] args) {
		StringDuplicate inter = ()->{
			String g = "engineer";
			HashSet<Character> hm = new HashSet<Character>();
			HashSet<Character> hm1 = new HashSet<Character>();
			for(int i=0;i<g.length();i++) {
				if(!hm.add(g.charAt(i))) {
					hm1.add(g.charAt(i));
				}
			}
			System.out.println(hm1);
		};
		inter.getDuplicate();
	}

}
