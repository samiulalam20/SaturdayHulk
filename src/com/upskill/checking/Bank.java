package com.upskill.checking;

public class Bank {

	public static void main(String[] args) {
		
		int a = 34;
		int b = 54;
		int addition = 26 + 89;
		int substraction = a - b;
		int multiplication = a * b;
		int division = a/b;
		
		System.out.println("Addition of a and b is: " + addition);
		System.out.println("Substraction result is: " + substraction);
		System.out.println("Multiplication result is: " + multiplication);
		System.out.println("Division result is: " + division);
		
		addition = addition + 78;
		System.out.println("After adding, the new addition result is: " + addition);
		
		Account BankOfAmericaCheckingAccount = new Account();
		
		BankOfAmericaCheckingAccount.GetAccountOwner();
		
		BankOfAmericaCheckingAccount.GetBalance();
		
		BankOfAmericaCheckingAccount.GetAccount();
		
		BankOfAmericaCheckingAccount.IsTheAccountRunning();
		
		BankOfAmericaCheckingAccount.SomeoneStoleMyMoney(50);
	}

}
