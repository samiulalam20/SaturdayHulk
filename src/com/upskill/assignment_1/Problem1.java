package com.upskill.assignment_1;

public class Problem1 {

	public static void main(String[] args) {
		// This java program calculate the perimeter of triangle, using given side measurements.
		// The program has a declared method to run.
		// Perimeter of a triangle = a + b + c
		
		perimeterOfATriangle();

	}
	
	public static void perimeterOfATriangle(){
		int a = 5;
		int b = 7;
		int c = 11;
		
		int perimeter = a + b + c;
		
		System.out.println("Perimeter of a triangle: " + perimeter);
	}

}
