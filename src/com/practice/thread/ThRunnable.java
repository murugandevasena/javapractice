package com.practice.thread;

public class ThRunnable implements Runnable {
	public static void main(String[] args) throws InterruptedException {
		ThPractice thPractice = new ThPractice();
		Thread t = new Thread(thPractice);
		t.start();
		t.sleep(200);
		System.out.println("hello murugan");
	}
	
	public void run() {
		synchronized(ThPractice.class) {
			System.out.println("Hello");
			try {
				ThPractice.class.wait(1000);
				System.out.println("Thread is running");
			}
			catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		//System.out.println("Thread is running");
	}
}
