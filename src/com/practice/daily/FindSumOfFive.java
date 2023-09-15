 package com.practice.daily;

import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindSumOfFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//find the combination of five using streams
		List<Integer> list = Arrays.asList(4,4,5,3,3);
		
		 long a=list.stream().flatMap(i->list.stream().filter(j->i+j==8 && i>j).map(j->i+","+j)).count();
		 System.out.println(a);
		 
		 List<Integer> l1 = Arrays.asList(1,3,4,5,6,7);
		 List<Integer> l2 = Arrays.asList(5,90,92,94,45);
		 List<List<Integer>> l3 = Arrays.asList(l1,l2);
		 List<Integer> l4 = l3.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		 System.out.println(l4);
		 
		 Integer dd = l4.stream().reduce(0,Integer::max);
		 System.out.println("sum dd:"+dd);
		 
		 int[] a1 = {1,3,4,5,6,7};
		 List<Integer> lj = Arrays.asList(1,3,4,5,6,7);
		 int[] a2 = {5,90,92,94,45};
		 
		 IntStream stream1 = Arrays.stream(a1);
	     IntStream stream2 = Arrays.stream(a2);

	     // Use flatMap to flatten the streams
	     IntStream flattenedStream = IntStream.concat(stream1, stream2);

	     // Print the flattened stream
	     flattenedStream.forEach(System.out::println);
		
		 //Count the possible combination which gives 8 as a output.
		long g= l4.stream().flatMap(i1->l4.stream().filter(j1->i1+j1==8 && i1>j1).peek(j1->System.out.println(i1 +", "+j1))).count();
		System.out.println("Count possaible of 8:"+g);
		
		//SummingFloat
		
		List<Float> lf = Arrays.asList(3.2f,4.3f,5.5f,6.7f,7.8f);
		Double g1 = lf.stream().collect(Collectors.summingDouble(Float::floatValue));
		System.out.println(g1);
		
		List<Float> g2 = lf.stream().filter(s->s<5).collect(Collectors.toList());
		System.out.println(g2); 
		 
		
		List<Double> lf1 = Arrays.asList(.99999,0.3990,0.588888888,10.9999999999,20.7666865448);
		
		Double g3 = lf1.stream().collect(Collectors.summingDouble(Double::doubleValue));
		System.out.println(g3);
		
		
		//find the length of the string
		List<String> words = Arrays.asList("GFG", "Geeks", "for",
                "GeeksQuiz", "GeeksforGeeks");
		
		Optional<String> str = words.stream().reduce((x11,x21)
				->x11.length() > x21.length() 
				? x11 : x21);
		str.ifPresent(System.out::println);
		
	
		 
	}

}
