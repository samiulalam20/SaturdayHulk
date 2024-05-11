package com.upskill.assignment_2;

public class Problem4 {
	
	//This java program prints numbers in the double incrementing sequence using a for loop.

	public static void main(String[] args) {
		
		doubleIncrement();
		
		}
		
		public static void doubleIncrement(){
			for(int i = 1; i<=500; i = i * 2){
				System.out.println("Values of double increments: " + i);
			}
		}

	}


