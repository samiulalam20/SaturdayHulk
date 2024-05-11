package com.upskill.assignment_2;

public class Problem8 {
	
	// This java program calculates the factorial of given number.

	public static void main(String[] args) {
		
		factorialNumber();

	}
	
	public static void factorialNumber(){
		
		int n = 7;
		int result = 1;
		for(int i = 1; i<=n; i++){
			result = result * i;
		}
		System.out.println("Factorial of " + n + " : " + result);
	}

}
