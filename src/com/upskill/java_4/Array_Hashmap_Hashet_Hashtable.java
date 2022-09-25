package com.upskill.java_4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashet_Hashtable {
public static void main(String[]args){
	//Array store multipul data using index
	
	int[] ageChewbacca = new int []{20,21,22,23,24,25}; //variable
	//Array Index                   0   1  2  3  4  5 //Array
	System.out.println("Student Age:" + ageChewbacca[2]);
	
	String[] nameChewbacca = new String[] {"Mohammad","Fariyan","Islam",};
	System.out.println("Student Name:" + nameChewbacca[2]);
	System.out.println("Total Student:" + nameChewbacca.length);
	
	//Multi-Dimentional Array
	int[][] ageChewbacca2D = {{22, 23, 24}, //[0][0] [0][1] [0][2]
			                  {22, 23, 27}};   //[1][0] [1][1] [1][2]
	System.out.println("Student Age 2D:" + ageChewbacca2D[1][2]);
	
	// Hashmap store multipul data using key-value pair, Implementation of Map Interface
	
	HashMap<String, Integer> Student = new HashMap<String, Integer>();
	Student.put("Businessman",20);
	Student.put("Doctor",21);
	Student.put("Cricketer",22);
	System.out.println("Student Age:" + Student.get("Cricketer"));
	
	HashMap<String, String> Capital = new HashMap<String, String>();
	Capital.put("Bangladesh","Dhaka");
	Capital.put("US","Washington");
	System.out.println("Student Age:" + Capital.get("US"));
	
	//Hashset store unordered collection containing unique value, Implementation of set interface
	
	HashSet<String> car = new HashSet<String>();
	car.add("BMW");
	car.add("Audi");
	car.add("Toyato");
	System.out.println("Car:"+ car);
	
	//HashTable store multipul data using key value pair, but is synchronized (only one thread can be modified0
	
	Hashtable<String, String> Region = new Hashtable<String, String>();
	Region.put("BD","Asia");
	Region.put("US","North America");
	System.out.println("Region:" + Region.get("US"));
	
}
	}
