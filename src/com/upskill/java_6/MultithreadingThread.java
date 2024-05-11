package com.upskill.java_6;

public class MultithreadingThread extends Thread{
	
	public void run(){
		try{
			System.out.println("Thread # " + Thread.currentThread().getId());
		}
		catch(Exception e){
			System.out.println("Exception is caught");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
