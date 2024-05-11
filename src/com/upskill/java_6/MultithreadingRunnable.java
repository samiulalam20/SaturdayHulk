package com.upskill.java_6;

public class MultithreadingRunnable implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		try{
			System.out.println("Thread # " + Thread.currentThread().getId());
		}
		catch(Exception e){
			System.out.println("Exception is caught");
		}
		
	}

}
