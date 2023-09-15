package com.practice;

public class ArmStrong {

	public static void main(String[] args) {
		int j=153;
		int n1,n2,n3,result;
		
		int temp =j;
		
	    n1=temp%10;
	    temp=temp/10;
	    n2=temp%10;
	    temp=temp/10;
	    n3 = temp%10;
	    result=(n3*n3*n3)+(n2*n2*n2)+(n1*n1*n1);
	    if(j==result) {
	    	System.out.println("it is an  armstrong number");
	    }
	    else {
	    	System.out.println("not an armstrong number");
	    }
	}

}
