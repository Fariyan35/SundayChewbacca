package com.upskill.java_5;

public class Encapsulation {
	
//Encapsulation used to hide the data using setter and getter method
	
	private String name = "abc";                 //write and read
	private int ssn = 12345678;                     //write only
	private String username = "upskill";      //read only
	
	// Setter Method- name
	public void setName (String value){           //set the data, write
		name = value;
	}
	
	// Getter Method - name
		public String getName(){                 //get the data, read
			return name;
		}
		//Setter Method - ssn
		public void setSSN(int value){
			ssn = value;
		}
		//Getter Method - username
		public String getUsername(){
			return username;
		}
			public static void main(String[]args){
				Encapsulation obj = new Encapsulation();
				obj.setName("Fariyan");
				System.out.println(obj.getName());
				obj.setSSN(12456789);
				System.out.println(obj.getUsername());
			}
}
