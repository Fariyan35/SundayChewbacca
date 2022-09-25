package com.upskill.assignment_4;


/*Write a USER PROGRAM using encapsulation that contains the username, password, email, first and last names of a user of our application. Display the user information in console output. */
	class Encapsulate {
		private String username = "Jue";
		private String password = "test121";
		private String email = "juel28@talentech.com";
		private String first_name = "Mohammad";
		private String last_name = "Haque";

		void display() {
			System.out.println("Username: " + username);
			System.out.println("Password: " + password);
			System.out.println("Email: " + email);
			System.out.println("First name: " + first_name);
			System.out.println("Last name: " + last_name);
		}
	}

	public class Assignment4_1 {

		public static void main(String[] args) {
			Encapsulate e = new Encapsulate();
			e.display();
		}
	}

