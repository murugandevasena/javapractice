package com.practice.daily;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseProduct {
	public static void main(String[] args) {
		
		List<Product> l1 = new ArrayList<Product>();
		
		Product p1= new Product(1, "IceCream", "Clove", 30000, "alli", 27, "Kashmir", "Capegemini", 130000, "female");
		Product p2= new Product(2, "Cake", "Ibaco",45000, "subbu", 35, "Himachal","pari tech" , 50000, "male");
		Product p3= new Product(3, "Rice", "Nandhi",65000, "maha", 32, "manipur", "govt employee", 2000000, "female");
		Product p4= new Product(4, "Maggi", "Esha",25000, "sushmitha", 27, "karanataka", "Flog", 2300000, "female");
		Product p5= new Product(5, "oil", "CR",85000, "Rampradesh", 45, "karnataka", "IFET", 400000, "male");
		Product p6= new Product(6, "Clothes", "Zudio", 30000, "sai Jaswasnth", 27, "Andhra Pradesh", "TCS", 130000, "male");
		Product p7= new Product(7, "IceCream", "trends", 60000, "Usha", 23, "Andhra Pradesh", "TCS", 21000, "female");
		Product p8= new Product(8, "IceCream", "pantalooms", 30000, "Soundar", 23, "TamilNadu", "HCL", 25000, "male");
		
		l1.add(p1);
		l1.add(p2);
		l1.add(p3);
		l1.add(p4);
		l1.add(p5);
		l1.add(p6);
		l1.add(p7);
		l1.add(p8);
		
		List<String> sortHighPrice = l1.stream().filter(x->x.price>50000).map(y->y.productName).collect(Collectors.toList());
		System.out.println(sortHighPrice);
		
		//by age
		
		List<String> l2 =l1.stream().filter(x->x.age>30 &&x.age<=40).map(y->y.customerName).collect(Collectors.toList());
		System.out.println(l2);
		
		//bysalary
		
		List<String> l3 = l1.stream().filter(x->x.salary>30000).map(y1->y1.productName).collect(Collectors.toList());
		System.out.println(l3);
		
	}

}
