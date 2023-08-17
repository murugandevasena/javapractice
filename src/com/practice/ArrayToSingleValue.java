package com.practice;

public class ArrayToSingleValue {
    public static void main(String[] args) {
		int a[]= {23,34,43,3};
		
     StringBuffer s=new StringBuffer();
   for(int i:a) {
   	s.append(i);
   }
   System.out.println(s);
    
    
    
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]);
//				
//		}
			
    }
}