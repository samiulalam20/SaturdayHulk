package com.upskill.java_1;

public class MethodType {
	
	 /* Types of Methods
	 
	 1. Void Method
	 2. Static Method
	 3. Return Type Method
	 
	 */
	
	public static int hourlyIncome = 65;

	public static void main(String[] args) {
		
		MethodType myIncome = new MethodType();
		
		myIncome.annualIncomeVoid();
		
		System.out.println("My monthly income = " + myIncome.monthlyIncomeReturn());
		System.out.println("My first name is " + myIncome.myName());
		
		weeklyIncomeStatic();
		
		isEmployed();
		

	}
	
	//void Method
	public void annualIncomeVoid(){
		int calculatedAnnualIncome = hourlyIncome * 2000;
		System.out.println("My Annual Income = " + calculatedAnnualIncome);
	}
	
	//return type Method
	public int monthlyIncomeReturn(){
		int calculatedMonthlyIncome = hourlyIncome * 180;
		return calculatedMonthlyIncome;
	}
	// return type Method
	public String myName(){
		String firstName = "Samiul";
		return firstName;
	}
	// void method
	public static void weeklyIncomeStatic(){
		int calculateWeeklyIncome = hourlyIncome * 40;
		System.out.println("My Weekly Income = " + calculateWeeklyIncome);
	}
	//Static Boolean Return Type
	public static boolean isEmployed(){
		boolean employment = true;
		System.out.println("He is employed? " + employment);
		return employment;
	}

}
