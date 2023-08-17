package com.practice.daily;

import java.util.Arrays;
import java.util.List;

public class FindThePairsOfEight {
	public static void main(String[] args) {
		
		
		
		List<Integer> a = Arrays.asList(4, 4, 5, 3, 2, 6, 8, 1, 0, 9);
		
		int count = 0;
		for (int i = 0; i < a.size(); i++) {
			for (int j = i + 1; j < a.size(); j++) {
				if (a.get(i) + a.get(j) == 8) {
					count++;
					System.out.println(a.get(i)+" "+a.get(j));
				}
			}
		}
		System.out.println(count);
	}
	//Stream

	
	

}
