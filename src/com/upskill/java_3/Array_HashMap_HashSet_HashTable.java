package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_HashMap_HashSet_HashTable {

	public static void main(String[] args) {
		
		//Array store multiple data using index
		int age = 25;											//Variable
		int[] ageHulk = new int[]{25, 30, 35, 38, 43, 38};		//Array
		
		//Array index 			  [0] [1] [2] [3] [4] [5]
		
		System.out.println("Student Age : " + ageHulk[3]);
		System.out.println("Total Student : " + ageHulk.length);
		
		String[] nameHulk = new String[]{"You", "Me", "Lee", "Cee", "Dee"};
		
		System.out.println("Student Name:  " + nameHulk[2]);
		System.out.println("Total Student: " + nameHulk.length);
		
		//Multi-Dimensional Array
		int[][] ageHulk2D = {{45, 36, 21, 23, 43},					//[0][0] [0][1] [0][2] [0][3] [0][4]
							 {23, 22, 36, 43}};						//[1][0] [1][1] [1][2] [1][3]
		
		System.out.println("Student Age 2D : " + ageHulk2D[0][3]);
		
		// Hashmap store multiple data using key-value pair, implementation of map interface
		
		HashMap<String, Integer> Student = new HashMap<String, Integer>();
		
		Student.put("Redwan", 27);
		Student.put("Sana", 31);
		Student.put("Sanam", 38);
		Student.put("Muazzem", 24);
		
		System.out.println("Hashmap Student Age : " + Student.get("Sana"));
		
		HashMap<String, String> Country = new HashMap<String, String>();
		
		Country.put("Bangladesh", "Dhaka");
		Country.put("United States of America", "Washington D.C.");
		Country.put("India", "Delhi");
		Country.put("Pakistan", "Islamabad");
		
		System.out.println("Hashmap Country Capital : " + Country.get("Bangladesh"));
		
		//HashTable store multiple data using key-value pair, no duplicate, also is synchronized (only one thread can be modified)
		
		Hashtable<String, String> Region = new Hashtable<String, String>();
		Region.put("BD", "Asia");
		Region.put("USA", "America");
		
		System.out.println("Region : " + Region.get("BD"));
		
		//HashSet store unordered collection containing unique value, Implementation of set interface
		
		HashSet<String> car = new HashSet<String>();
		car.add("Audi");
		car.add("BMW");
		car.add("Tesla");
		car.add("Range Rover");
		
		System.out.println("Car : " + car);
		
	}
}
