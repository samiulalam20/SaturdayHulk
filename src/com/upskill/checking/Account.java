package com.upskill.checking;

public class Account {
	
	public String UserName = "samiul";
	public String FirstName = "samiul";
	public String LastName = "sa";
	public float Amount = 100.50f;
	public String AccountNumber = "ART56378";
	public boolean isActive = false;
	
	public void GetAccountOwner(){
		System.out.println("The Username is: " + UserName);
		System.out.println("The account holder's name is: " + FirstName + " " + LastName);
	}
	
	public void GetBalance(){
		System.out.println("Available balance: $" + Amount);
	}
	
	public void GetAccount(){
		System.out.println("Account holders account number: " + AccountNumber);
	}
	
	public void IsTheAccountRunning(){
		System.out.println(isActive);
	}
	
	public void SomeoneStoleMyMoney(float HowMuchHeStole){
		float result = Amount - HowMuchHeStole;
		System.out.println("The amount stolen: " + result);
	}

}
