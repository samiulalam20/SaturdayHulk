package com.upskill.assignment_2;

public class Problem7 {
	
	// This java program takes two integer values in variables and then swaps the value of the variables and prints.

	public static void main(String[] args) {
		
		swapNumbers();

	}
	
	public static void swapNumbers(){
		 int a = 25;
		 int b = 30;
		 int temp;
		 temp = a;
		 a = b;
		 b = temp;
		 
		 System.out.println("Swap value of a: " +  a);
		 System.out.println("Swap value of b: " + b);
	}

}
