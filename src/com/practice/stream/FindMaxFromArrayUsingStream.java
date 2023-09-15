package com.practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindMaxFromArrayUsingStream {
public static void main(String[] args) {
	
	int [] a = {12,14,16,11,1,9,18};
	List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
	
	int max= list.stream().max((x,y)->x.compareTo(y)).get();	
	System.out.println(max);
	
	
	
}
}
