package com.practice.functionalinterface;

import java.util.Arrays;
import java.util.List;

public class UseStringInterface  {
	public static void main(String[] args) {
		StringInterface i =(d)->{
			for(int j=0;j<d.size();j++) {
				System.out.println(d.get(j).charAt(d.get(j).length()-1));
			}		
		};
		List<String> d = Arrays.asList("murugan","alli","valarmathi");
		i.getLastChar(d);
	}
}
