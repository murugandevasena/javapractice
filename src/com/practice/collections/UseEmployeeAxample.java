package com.practice.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class UseEmployeeAxample {
	public static void main(String[] args) {
		Employee e1= new Employee("murugan", 1, "male", 100000, 4);
		Employee e2= new Employee("Alli", 17, "female", 10000, 10);
		Employee e3= new Employee("Deva", 32, "female", 20001, 2);
		Employee e4= new Employee("Nandhini", 4, "female", 20000, 6);
		Employee e5= new Employee("prabha", 5, "male", 30000, 1);
		
		List<Employee> list = Arrays.asList(e1,e2,e3,e4,e5);
		
//		List<String> l1 = list.stream().filter(x->x.getSalary()<=10000).map(y->y.getName()).sorted().collect(Collectors.toList());
//		System.out.println(l1);
//		
//		List<Employee> l2 = list.stream().filter(x->x.getExperience()>6).collect(Collectors.toList());
//		System.out.println(l2);
//		
//		List<Integer> l3 = list.stream().filter(x->x.getSalary()>10000).map(y->y.getSalary()).sorted().skip(1).toList();
//		System.out.println(l3);
//		
//		list.stream().peek(x->x.setSalary(x.getSalary()+10000)).map(y->y.getSalary()).forEach(x->System.out.println(x));
//		
//		long x = list.stream().count();
//		System.out.println(x);
		
		Map<Integer, Employee> er =	list.stream().sorted(Comparator.comparing(Employee::getExperience).reversed()).collect(Collectors.toMap(i->i.getId(), j->j));
		er.keySet().forEach(u->System.out.println(er.get(u) +" "+u));
		System.out.println(er);
		
		Integer g = list.stream().map(x->x.getSalary()).reduce(0, (i, j)->(i+j));
		System.out.println(g);
		
		
//		Employee t = list.stream().max(Comparator.comparingInt(Employee::getSalary)).get();
//		System.out.println(t);
//		
//		long u = list.stream().min(Comparator.comparingInt(Employee::getSalary)).map(y->y.getSalary()).get();
//		System.out.println(u);
		
		Optional<Integer> max = list.stream().map(x->x.getSalary()).distinct().sorted(Comparator.reverseOrder()).findFirst();
		max.orElse(0);
		
		//Integer max = list.stream().map(x->x.getSalary()).distinct().sorted(Comparator.reverseOrder()).findFirst().orElseThrow(()->new DataNotFoundException);
		
		boolean isMale = list.stream().anyMatch(i->i.getGender().equals("male"));
		System.out.println(isMale);
		
		boolean isMale1 = list.stream().allMatch(i->i.getGender().equals("male"));
		System.out.println(isMale1);
		
		String s = list.stream().map(x->x.getName()).reduce("Output is:",(i,j)-> (i+j));
		System.out.println(s);
		
		Integer s1 = list.stream().map(x->x.getSalary()).reduce(0,(i,j)-> (i+j));
		System.out.println(s1);
		
		//count
		Integer s2 = list.stream().map(x->x.getSalary()).reduce(0,(i,j)-> (i+1));
		System.out.println(s2);
		
		
		String h = list.stream().map(x->x.getName()).reduce("", (i,j)->(j));
		System.out.println(h);
		
		Integer total = list.stream().map(x->x.getSalary()).collect(Collectors.summingInt(i->i+1));
		System.out.println(total);
		
		
		Map<String,List<Employee>> it = list.stream().collect(Collectors.groupingBy(Employee::getGender));
		System.out.println(it);
		
		
		
//		
		
	}

}
