package com.upskill.assignment_2;

import java.util.Scanner;

public class Problem10 {
	
	//This java program takes a fahrenheit temperature from user input and converts it to celcius temperature value.

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the degree in Fahrenheit: ");
		
		double fahrenheit = s.nextInt();
		s.close();
		
		temperatureConversion(fahrenheit);

	}
	
	public static void temperatureConversion(double fahrenheit){
		
		double celsius = ((fahrenheit - 32) * 5.0) / 9.0;
		
		System.out.println("The equivalent celsius degree: " + celsius);
	}

}
