package com.upskill.java_4;

public class Encapsulation {
	
	// Encapsulation used to hide the data using setter and getter method
	
	private String name = "upskill";			//write and read
	private int ssn = 123456789;				//write only
	private String username = "samiulalam";		//read only
	
	// Setter method - name						set the data and write
	public void setName(String value){
		name = value;
	}
	
	// Getter method - name						get the data and read
	public String getName(){
		return name;
	}
	
	// Setter method - SSN						set the data and write
	public void setSSN(int value){
		ssn = value;
	}
	
	// Getter method - username					get the data and read
	public String getUsername(){
		return username;
	}

	public static void main(String[] args) {
		
		Encapsulation obj = new Encapsulation();
		
		obj.setName("Samiul");
		System.out.println(obj.getName());
		
		obj.setSSN(987654321);
		
		System.out.println(obj.getUsername());

	}

}
