package com.practice.hashcodeequalsoverride;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SampleList {
	public static void main(String[] args) {
		//List<String> list = new ArrayList<String>();
		
		//failSafe
		List<String> list = new CopyOnWriteArrayList<>();
		list.add("muru");
		list.add("murugan");
		list.add("ramya");
		
		for(String x:list) {
			list.remove("muru");	
		}
		System.out.println(list);
	}

}
