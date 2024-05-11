package com.upskill.assignment_1;

public class Problem2 {

	public static void main(String[] args) {
		// This java program calculate the perimeter of rectangle, using given width and length measurements.
		// The program has a declared method to run.
		// Perimeter of a rectangle = 2(length + width)
		
		perimeterOfARectangle();

	}
	
	public static void perimeterOfARectangle(){
		int width = 9;
		int length = 13;
		
		int perimeter = 2 * (length + width);
		
		System.out.println("Perimeter of a rectangle: " + perimeter);
	}

}
