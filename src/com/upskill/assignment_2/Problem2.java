package com.upskill.assignment_2;

public class Problem2 {
	
	//This java program writes a method and takes variable as a method parameter.
	//The program displays the grade achieved, and decided using if else statements.

	public static void main(String[] args) {
		gradeCalculate(43);

	}
	
	public static void gradeCalculate(int marks){
		if(marks >= 90 && marks <= 100){
			System.out.println("Grade A");
		}
		else if(marks >= 80 && marks <= 89){
			System.out.println("Grade B");
		}
		else if(marks >= 70 && marks <= 79){
			System.out.println("Grade C");
		}
		else if(marks >= 60 && marks <= 69){
			System.out.println("Grade D");
		}
		else if(marks >= 0  && marks <= 60){
			System.out.println("Failed");
		}
		else{
			System.out.print("Error");
		}
	}

}
