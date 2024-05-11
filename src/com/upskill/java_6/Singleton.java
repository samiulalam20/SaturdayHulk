package com.upskill.java_6;

public class Singleton {
	
	// Singleton is a class than can have only one object.
	
	// Private instructor, it prevents any other class from instantiating.
	
	private Singleton(){
		
	}
	
	//Private static object of the class
	private static Singleton singletonObj = new Singleton();
	
	public static Singleton getInstance(){
		return singletonObj;
	}
	
	protected static void demo(){
		System.out.println("Demo method for singleton class");
	}
	
	protected static void demo2(){
		System.out.println("Demo 2 method for singleton class");
	}
	
	protected static void demo3(){
		System.out.println("Demo 3 method for singleton class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
