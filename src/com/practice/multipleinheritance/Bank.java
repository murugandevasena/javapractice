package com.practice.multipleinheritance;

public class Bank {
	int findInterestOfLoan() {
		return 50000*10/100;
	}
	int findInteresOfLoan(int salary) {
		return ((salary*10)+50000)*10/100;
	}
	
	int findInterstOfLoan(int salary,int propertyValue) {
		return ((propertyValue/2)+(salary*10)+50000)*10/100;
	}

}
