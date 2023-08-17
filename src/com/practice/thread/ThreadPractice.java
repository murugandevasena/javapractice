package com.practice.thread;

public class ThreadPractice extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
