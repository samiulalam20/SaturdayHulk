package com.upskill.checking;

public class Banking {

	public static void main(String[] args) {
		//exampleForLoop();
		//exampleWhileLoop();
		//exampleDoWhileLoop();
		exampleIfElse();
		exampleNestedForLoop();
		exampleSwitchCases();

	}
	
	public static void exampleForLoop(){
		int i;
		for(i=1; i>=1; i++){
			System.out.println("Transaction " + i);
		}
	}
	
	public static void exampleWhileLoop(){
		int i = 20;
		while(true){
			System.out.println("Transaction " + i);
			i--;
		}
	}
	
	public static void exampleDoWhileLoop(){
		int i = 0;
		do{
			System.out.println("Transaction " + i);
			i++;
		}
		while(i<=20);
	}
	
	public static void exampleIfElse(){
		String response = "No";
		
		if(response == "Yes"){
			System.out.println("Your balance is USD 234");
		}
		else if(response == "No"){
			System.out.println("Take care");
		}
		else{
			System.out.println("Error");
		}
	}
	
	public static void exampleNestedForLoop(){
		int numberOfAlbums;
		int numberOfSongs;
		
		for(numberOfAlbums = 1; numberOfAlbums <= 10; numberOfAlbums++){
			System.out.println("Number of albums: " + numberOfAlbums);
			for(numberOfSongs = 1; numberOfSongs <= 20; numberOfSongs++){
				System.out.println("Album: " + numberOfAlbums + "song name: " + numberOfSongs);
			}
		}
	}
	
	public static void exampleSwitchCases(){
		
		String typeofaccount = " ";
		
		switch(typeofaccount){
		case "Checking":
			System.out.println("Menu for checking account");
			break;
		case "Savings":
			System.out.println("Menu for savings account");
			break;
			default:
				System.out.println("Exiting the ATM");
		}
	}

}
