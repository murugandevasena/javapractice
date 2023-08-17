package com.practice.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeparateNumbers {
	public static void main(String[] args) {
		String s = "abcd1234dfr";
		char[] a = s.toCharArray();
		
		List<Character> l=new ArrayList<Character>();
		for(Character c:a) {
			l.add(c);
		}
		//System.out.println(l);
		
		s.chars().filter(x->Character.isDigit(x)).forEach(x->System.out.println((char)x));
		s.chars().filter(x->x>='0'&&x<='9').forEach(y->System.out.print((char)y));
	//	System.out.println(s);
		

 
	}

}
