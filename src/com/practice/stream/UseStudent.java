package com.practice.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UseStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobileNumber mn = new MobileNumber("1234");
		MobileNumber mn1 = new MobileNumber("2345");
		Student s1 = new Student("Murugan", 37, new Address("621802"),Arrays.asList(mn,mn1));
		
		
		MobileNumber mn2 = new MobileNumber("9884");
		MobileNumber mn3 = new MobileNumber("7869");
		Student s2 = new Student("Hari", 27, new Address("421808"),Arrays.asList(mn2,mn3));
		

		MobileNumber mn4 = new MobileNumber("5634");
		MobileNumber mn5 = new MobileNumber("6753");
		Student s3 = new Student("Ush", 23, new Address("345673"),Arrays.asList(mn4,mn5));
		
		MobileNumber mn6 = new MobileNumber("8881");
		MobileNumber mn7 = new MobileNumber("7723");
		Student s4 = new Student("Sai Jaswanth", 47, new Address("312344"),Arrays.asList(mn6,mn7));
		
		
		MobileNumber mn8 = new MobileNumber("6662");
		MobileNumber mn9 = new MobileNumber("8965");
		Student s5 = new Student("Soundar", 17, new Address("312344"),Arrays.asList(mn8,mn9));
		
		
		MobileNumber mn10 = new MobileNumber("3232");
		MobileNumber mn11 = new MobileNumber("5783");
		Student s6 = new Student("Karthiga", 57, new Address("788123"),Arrays.asList(mn10,mn11));
		
		
		//Using stream find student name start with 's'
		
		List<Student> slist = Arrays.asList(s1,s2,s3,s4,s5,s6);
		
		Optional<Student> o = slist.stream().filter(x->x.getName().startsWith("S")).findFirst();
		System.out.println(o.isPresent()?o.get().getName():"No student found");
		
		//Get the list of student whos name starts with 'S'
		List<String> st = slist.stream().filter(x->x.getName().startsWith("S")).map(y->y.getName()).collect(Collectors.toList());
		System.out.println(st);
		
		//get name whose moblie number equals to "8965"
		
		List<String> b = slist.stream().filter(x->x.getMobileNumbers().equals("3232")).map(y->y.getName()).collect(Collectors.toList());
		System.out.println(b);
		
		//Get aname whose age group lies in between the range
		List<String> age = slist.stream().filter(x->x.getAge()>30 && x.getAge()<50).map(y->y.getName()).collect(Collectors.toList());
		System.out.println(age);
		
		Optional<Integer> o1 = slist.stream().filter(x->x.getAddress().equals("788123")).map(y->y.getAge()).findFirst();
		System.out.println(o1);
		
		
		//Convert List<Student> into List<String> of student name
		List<String> studentList = slist.stream().map(Student::getName).collect(Collectors.toList());
		System.out.println(studentList);
		
		 //Convert List<students> to String
		String name = slist.stream().map(Student::getName).collect(Collectors.joining(",", "[", "]"));
		System.out.println(name);
		
		//print uppercase letters
		String na = slist.stream().map(c->c.getName().toUpperCase()).collect(Collectors.joining(",", "[", "]"));
		System.out.println(na);
		
		//Count the no of persons whose name length is greater than 3
		long l = slist.stream().filter(x->x.getName().length()>4).count();
		System.out.println(l);
		
		//summary statitics
		IntSummaryStatistics stats = slist.stream().mapToInt(x->x.getAge()).summaryStatistics();
		System.out.println(stats);
	}

}
