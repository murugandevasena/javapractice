package com.practiceon14082023;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Treeset does not allow duplicate elements , it follow the default ascending order.
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(32);
		treeSet.add(54);
		treeSet.add(21);
		treeSet.add(32);
		treeSet.add(45);
		treeSet.add(67);
		System.out.println(treeSet);
		System.out.println(treeSet.pollFirst());
		System.out.println(treeSet.pollLast());
		
		Iterator<Integer> itr = treeSet.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
