package com.practice.multipleinheritance;

public class PrivateBank extends Bank {

		int findInterestOfLoan() {
			return 50000*30/100;
		}
		int findInteresOfLoan(int salary) {
			return ((salary*5)+50000)*7/100;
		}
		
		int findInterstOfLoan(int salary,int propertyValue) {
			return ((propertyValue/3)+(salary*8)+50000)*4/100;
		}
	}
	
