package com.upskill.assignment_1;

public class Problem3 {

	public static void main(String[] args) {
		// This java program declares a integer method function that multiplies two given values, and therefore returns.
		// The method function is then called and stored in a variable.
		// The return from the method function is used and added to the other two variable values.
		
		multipliedValue();
		int a = 9;
		int b = 11;
		int multiplication = multipliedValue();
		int addition = multiplication + a + b;
		
		System.out.println("Addition of a, b, and return function value: " + addition);

	}
	
	public static int multipliedValue(){
		
		int a = 9;
		int b = 11;
		
		int multiplication = a * b;
		
		return multiplication;
	}

}
