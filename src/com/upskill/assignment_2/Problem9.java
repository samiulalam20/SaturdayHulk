package com.upskill.assignment_2;

public class Problem9 {

	public static void main(String[] args) {
		
		swapString();

	}
	
	public static void swapString(){
		
		String word1 = "Up";
		String word2 = "Skill";
		
		String swap = word1;
		word1 = word2;
		word2 = swap;
		
		System.out.println("Swaping of word 1 is: " + word1);
		System.out.println("Swaping of word 2 is: " + word2);
	}

}
