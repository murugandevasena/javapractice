package com.practiceon14082023;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {

		int[] a = { 2, 3, 5, 1, 6, 7, 19, 32 };
		TreeSet<Integer> set = new TreeSet<Integer>();
		for (Integer i : a) {
			set.add(i);
		}
		System.out.println(set.pollFirst());
		System.out.println(set.last());
		//asecendiing order
		//Iterator<Integer> itr = set.iterator();
		Iterator<Integer> itr = set.descendingIterator();
		//desecding order
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
//		String g ="murugan";
//		TreeSet<String> set1 = new TreeSet<String>();
//		for(int i=0;i<g.length();i++)
//		{
//			set1.ad(g.charAt(i));
//		}

	}
}
