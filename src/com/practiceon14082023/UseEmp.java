package com.practiceon14082023;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseEmp {
	public static void main(String[] args) {
		List<String> c1 =new ArrayList<String>();
		c1.add("jayankondam");
		c1.add("kumbakonam");
		c1.add("thanjour");
		
		Emp emp =new Emp("Murugan", 38, 250000, c1);
		
		List<String> c2 =new ArrayList<String>();
		c2.add("Chennai");
		c2.add("bangalour");
		c2.add("Pune");
		
		Emp emp1 =new Emp("Deva", 28, 150000, c2);
		
		List<String> c3 =new ArrayList<String>();
		c3.add("delhi");
		c3.add("srinagar");
		c3.add("jayankondam");
		
		Emp emp2 =new Emp("Ramsaran", 23, 650000, c3);
		
		List<Emp> employeeList = new ArrayList<Emp>();
		employeeList.add(emp);
		employeeList.add(emp1);
		employeeList.add(emp2);
		
		List<String> l1 = employeeList.stream().flatMap(x->x.getCity().stream()).distinct().collect(Collectors.toList());
		System.out.println(l1);
		
		List<Integer> l2 = employeeList.stream().map(y->y.getAge()).collect(Collectors.toList());
		System.out.println(l2);
		
		List<String> l3 = employeeList.stream().filter(z->z.getAge()>30).map(y1->y1.getName()).collect(Collectors.toList());
		System.out.println(l3);
		
		
		
		
	}

}
