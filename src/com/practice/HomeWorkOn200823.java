package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class HomeWorkOn200823 {

	public static void main(String[] args) {
		List<Integer> ls = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		//no.of Possible combination of 9.
		ls.stream().flatMap(x->ls.stream().filter(y->x+y==9 &&x>y).map(y->x+"-"+y)).forEach(z->System.out.println(z));	
		
		
		//no of empty strings in string array
		String[] a = { "","Murugan","ram","","rajesh","",""};
		long count = Arrays.stream(a).filter(x->x=="").count();
		System.out.println("Count of empty string from string array:"+count);
		
		// find the maximum number
		int[] a1 = {1,3,5,6,7,8,9};
		List<Integer> l1 = Arrays.asList(1,8,5,6,7,3,9);
		int m1 = l1.stream().max((x,y)->x-y).get();
		System.out.println("Maximum number from integer array:"+ m1);
		
		//find the second maximum
		int m2 = l1.stream().sorted(Comparator.comparing(x->-x)).toList().get(1);
		System.out.println("Second maximum number from the array:"+m2);
		
		
		
		//second largest using for loop
		int temp=0;
		int total = a1.length;
		for(int i=0;i< a1.length;i++) {
			for(int j=i+1;j<a1.length;j++) {
				if(a1[i]>a1[j]) {
					temp = a1[i];
					a1[i]=a1[j];
					a1[j]=temp;		
				}
			}
		}
		System.out.println("Second maximum using for loop:" +a1[total-2]);
		
		
		
		List<Integer> lsort = Arrays.asList(9,2,3,4,5,6,7,8,1);
	
		//find the maximum using for loop
		 int y = findTheLargest(lsort);
		 System.out.println(y);	
		 
		 String[] a2 = {"murugan","rajesh","ganga","kalai","rampradesh","ramalingam"};
		 List<String> lstr = Arrays.asList(a2);
		 List<String> lstr3 = Arrays.asList();
	     String lt;
		 for(int i =0;i<lstr.size();i++) {
			   System.out.println(lstr.get(i).startsWith("m"));
			   //lstr3.add(lstr.get(i).startsWith("m"));
		 }
		 
		 //remove duplicates using set
		 String[] a3 = {"murugan","rajesh","ganga","kalai","rampradesh","ramalingam","murugan","ramalingam"};
		 List<String> lstr1 = Arrays.asList(a3);
		 Set<String> s1 = new HashSet<String>();
		 Set<String> s2= lstr1.stream().filter(x->!s1.add(x)).collect(Collectors.toSet());
		 System.out.println("Remove duplicates using set:"+s2);
		 
		 
		 //remove duplicates from string
		 String h = "muruganramalingam";
		 char [] d = h.toCharArray();
		 LinkedHashSet<Character> lnk = new LinkedHashSet<Character>();
		 for(char c:d) {
			 lnk.add(c);
		 }
		 System.out.println("Remove duplicates using linkedHashSet:"+lnk);
		
		 
		//Square of numbers which are greater than or equal to 20. 
		 int [] sq = {1,4,5,6,7,2,3,6,7,8};
		 List<Integer> lsq = Arrays.stream(sq).boxed().collect(Collectors.toList()); 
		 List<Integer> li = lsq.stream().filter(x->x*x >=20).map(y1->y1).collect(Collectors.toList());
		 System.out.println("Square of numbers with greater than or equal to 20: "+li);
		 
		 
		 //remove duplicates and return in an asencending order.
		 int [] g1= {1,7,3,4,6,5,2,7};
		 List<Integer> lg1 = Arrays.stream(g1).boxed().collect(Collectors.toList());
		 int[] g2 = {2,1,3,4};
		 List<Integer> lg2 = Arrays.stream(g2).boxed().collect(Collectors.toList());
		 Set<Integer> lg3 = removeDuplicateAndAsending(lg1,lg2);
		 System.out.println("Array duplicate and desc"+lg3);
		 
		 
		 //remove duplicated from single int [] array
		 int [] x1= {1,7,3,4,6,5,2,7};
		 for(int o=0;o<x1.length;o++) {
			 for(int o1=o+1;o1<x1.length;o1++) {
				 if(x1[o]==x1[o1]) {
					 System.out.println("remove g1[o1]:" +x1[o1]);
				 }
			 }
		 }
		 
		 //Remove null value from array
		 List<String> lo = new ArrayList<String>();
		 String[] rmnull = {"murugan","rajan","ramesh","soundar",""};
		 for(String b: rmnull) {
			 if(b!= null&& b.length()>0) {
				 lo.add(b);
			 }
		 }
		 System.out.println("String array after removal of null value :"+ lo);
	}

	
	private static Set<Integer> removeDuplicateAndAsending(List<Integer> lg1, List<Integer> lg2) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<Integer>(lg1);
		set.addAll(lg2);
		System.out.println("addall:"+set);
		Set<Integer> intersection = new HashSet<Integer>(lg1);
		intersection.retainAll(lg2);
		System.out.println("intersection:"+intersection);
		set.removeAll(intersection);
		return set;
	}


	private static int findTheLargest(List<Integer> lsort) {
		// TODO Auto-generated method stub
		int temp = lsort.get(0);
		for(int i=0;i<lsort.size();i++) { 
			if(temp<lsort.get(i)) {
				temp=lsort.get(i);
			}
		}
		return temp;	
	}
}
