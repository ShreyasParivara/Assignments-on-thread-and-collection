package com.te.threadAssignment;

public class Main2 {
	public static void main(String[] args) throws InterruptedException {
		threadClass thread = new threadClass();
		
		thread.start();
		for( int i = 1; i < 10; i++) {
			System.out.println(i);
			Thread.sleep(1000);
			
		}
	
		
		
	}

}
