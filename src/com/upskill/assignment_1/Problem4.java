package com.upskill.assignment_1;

public class Problem4 {

	public static void main(String[] args) {
		// This java program creates two function that returns value. The programs operates the subtraction and displays.
		
		Problem4 solutionToProblem4 = new Problem4();
		
		int solution = solutionToProblem4.biggerNumber() - solutionToProblem4.smallerNumber();
		
		System.out.println("The subtraction of smaller number from bigger number is " + solution);

	}
	
	public int smallerNumber(){
		int number1 = 30;
		return number1;
	}
	
	public int biggerNumber(){
		int number2 = 50;
		return number2;
	}

}
