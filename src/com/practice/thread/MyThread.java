package com.practice.thread;

public class MyThread implements Runnable {
	public void run() {
		synchronized (MyThread.class) {
			System.out.println("Hello");
			try {
				MyThread.class.wait(3000); // 3sec
				System.out.println("Thread is awaked");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

//	public class MyThread extends Thread {
//		public void run() {
//			System.out.println("Hello");
//		}

}
