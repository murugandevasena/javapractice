package com.practice.inheritance;

public class IOBBank {

 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ReserveBank reserveBank= new ReserveBank();
		 reserveBank.calc(12, 13);
		 System.out.println(reserveBank.calc(12, 13));
		 IOBBank iobBank = new IOBBank();
		 int d=iobBank.calc(22,12);
		 System.out.println(d);
	}
	public static int calc(int a1,int a2) {
		return (a1+a2)/2;
	}

}
