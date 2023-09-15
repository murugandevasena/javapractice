package com.practice;

public class DuplicateRemovalFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //remove duplicated from single int [] array
		 int [] x1= {1,7,3,4,6,5,2,7,3,4,6,7,1,10};
		 for(int i=0;i<x1.length;i++) {
			 for(int j=i+1;j<x1.length;j++) {
				 if(x1[i]==x1[j]) {
					 System.out.println("remove g1[o1]:" +x1[j]);
				 }
			 }
		 }
	}
}
