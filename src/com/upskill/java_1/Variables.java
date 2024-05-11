package com.upskill.java_1;

public class Variables {
	
	public String country = "USA"; // Instance OR global variable
	public static String region = "North America"; // Static variable
	
	// Variables in Java
	
	// Instance OR global variable - variables declared in Class level, outside method
	// Local variable - variables declared in methods
	// Static variable - variables belong to class and do not require creating object
	// Method parameter - variables used as method parameter

	public static void main(String[] args) {
		ny("Madison Square", 789);
		nj("Essex");
		ct("Hartly");
		
		Variables myObject = new Variables();
		System.out.println(myObject.country);
		System.out.println(region);

	}
	
	public static void ny(String county, int population){
		String city = "Queens"; // Local variable
		System.out.println(city);
		
		String myCounty = county;
		System.out.println(myCounty);
		System.out.println(population);
	}
	
	public static void nj(String county){  // Method parameter
		String city = "Bloomfield"; // Local variable
		System.out.println(city);
		
		String myCounty = county;
		System.out.println(myCounty);
	}
	
	public static void ct(String county){
		String city = "Hartford"; // Local variable
		System.out.println(city);
		
		String myCounty = county;
		System.out.println(myCounty);
	}

}
