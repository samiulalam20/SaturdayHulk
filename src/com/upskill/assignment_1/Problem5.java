package com.upskill.assignment_1;

public class Problem5 {

	public static void main(String[] args) {
		// This java program displays name of students and their age in three different and separate methods.
		// The first student representing static method.
		// The second method representing void method.
		// The third method representing return type method.
		
		student1();
		
		Problem5 objMethod = new Problem5();
		objMethod.student2();
		
		System.out.println("Name of third student: " + objMethod.studentName3());
		System.out.println("Age of third student: " + objMethod.studentAge3());
		

	}
	
	public static void student1(){
		String studentName1 = "Samiul";
		int studentAge1 = 23;
		System.out.println("Name of first student: " + studentName1);
		System.out.println("Age of first student: " + studentAge1);
	}
	
	public void student2(){
		String studentName2 = "Rasel";
		int studentAge2 = 35;
		System.out.println("Name of second student: " + studentName2);
		System.out.println("Age of second student: " + studentAge2);
	}
	
	public String studentName3(){
		String name3 = "Alam";
		return name3;
	}
	
	public int studentAge3(){
		int age3 = 27;
		return age3;
	}

}
