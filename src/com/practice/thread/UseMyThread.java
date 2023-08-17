package com.practice.thread;

public class UseMyThread {
	public static void main(String [] args) throws InterruptedException {
		MyThread myThread = new MyThread();
		Thread t = new Thread(myThread);
		t.start();
		//myThread.run();
		Thread.sleep(2000);  //2sec
		System.out.println("Hi");
	}

}
