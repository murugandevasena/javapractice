package com.practice.thread;

public class UseThreadPractice {
	
	public static void main(String[] args) throws InterruptedException {
		ThreadPractice t1 = new ThreadPractice();
		ThreadPractice t2 = new ThreadPractice();
		ThreadPractice t3 = new ThreadPractice();
		t1.start();
		t2.start();
		t3.start();
	}

}
