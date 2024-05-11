package com.upskill.assignment_2;

public class Problem3 {

	public static void main(String[] args) {
		
		//This java program compares two number that is returned from a return type method.
		
		Problem3 comparison = new Problem3();
		
		if(comparison.numberOne() - comparison.numberTwo() < 0){
			System.out.println(comparison.numberTwo() + " is larger than " + comparison.numberOne());
		}
		else if(comparison.numberOne() - comparison.numberTwo() > 0){
			System.out.println(comparison.numberTwo() + " is smaller than " + comparison.numberOne());
		}
		else{
			System.out.println(comparison.numberOne() + " and " + comparison.numberTwo() + " are equal ");
		}

	}
	
	public int numberOne(){
		int smallNumber = 10;
		return smallNumber;
	}
	
	public int numberTwo(){
		int largeNumber = 10;
		return largeNumber;
	}

}
