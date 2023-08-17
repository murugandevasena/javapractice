package com.practice.daily;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveDuplicatesInArray {

	public static void main(String[] args) {
	    int[] a = {2,6,3,8,5,5,6,7,8,8,1,13};
	    removeDuplicates(a);
	    int d = removeDuplicatesUsingForLoop(a);
	    for(int k1=0;k1<d;k1++) {
	    	System.out.println(a[k1]);
	    }
	    
	    //Using stream
	    List<Integer> list = IntStream.of(a).boxed().collect(Collectors.toList());
	    list.stream().distinct().collect(Collectors.toList());
	    System.out.println("remove duplicate using stream:"+list.stream().distinct().collect(Collectors.toList()));
	    
	    //using set
	    HashSet<Integer> hashSet = new HashSet<Integer>();
	    Set<Integer> set = list.stream().filter(x->hashSet.add(x)).collect(Collectors.toSet());
	    System.out.println("Using set"+ set);

}

	private static int removeDuplicatesUsingForLoop(int [] a) {
		// TODO Auto-generated method stub
		int x= a.length;
		int j=0;
		//int[] temp =new int[x];
		for(int i=0;i< x-1;i++) {
			if(a[i]!=a[i+1]) {
				a[j++]=a[i];
			}
		}
//		temp[j++] = a[x - 1];
//		for (int i = 0; i < j; i++) {
//            a[i] = a[i];
//        }
		  a[j++] = a[x - 1];
		return j;
	}

	private static void removeDuplicates(int[] a) {
		// TODO Auto-generated method stub
		//HashSet
		//It does not follow the insertion order.
		HashSet<Integer> h = new HashSet<Integer>();
		 for(int i=0;i<a.length;i++) {
			 h.add(a[i]);
		 }
		 System.out.println(h);
		
		 //Using LinkedHashSet
		 //Linked hash set follow the insertion order.so that we can predict the order.
		 LinkedHashSet<Integer> h1 = new LinkedHashSet<Integer>();
		 for(int i=0;i<a.length;i++) {
			 h1.add(a[i]);
		 }
		 System.out.println(h1);
	}
}
