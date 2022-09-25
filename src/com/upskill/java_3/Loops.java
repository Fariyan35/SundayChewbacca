package com.upskill.java_3;

public class Loops {
	
	/*Type of loops
	1. For Loop
	2. White Loop
	3. Do white Loop
	4. Infinite Loop */

	public static void main(String[] args) {
		//practiceForLoop();
       // practicewhileLoop();
      //  practiceDowhileLoop();
       // practiceInfiniteLoop();
        // practiceNestedLoop();
	}
	
	public static void practiceForLoop(){
		int i;                                                              //For Loop - Do again and again upto upper limit
		for (i =1; i <= 10; i++){                                           //Initialize the variable
			System.out.println("For Loops Number =" + i);                   //Setting lower limit, Upper limit, increment or decrement
		}                                                                   //Statement
	}
 public static void practicewhileLoop(){                                    //While Loop - Do again and again upto condition match
	 int i =1;                                                              //Initializing variables
	 while(i<=10){                                                          //Setting condition
		 System.out.println("While Loops Number =" +i);                     //Statement
		 i++;                                                               //Increment or decrement
	 }
 }
  public static void practiceDowhileLoop(){                                //Do while Loop - Do action then match condition                                                                      //Initialize the variable
	  int i = 1;                                                           //Initialize the variable
	  do{                                                                  
	     System.out.println("Do While Loop =" +i);                         //Statement
		 i++;                                                              //Increment or decrement
	  } while (i<=10);                                                     //Checking condition
  }
  public static void practiceInfiniteLoop(){                                  //Infinite Loop - Never ending Loop
	  int i;                                                            //Initialize the variable
	  for (i =1; ; i++){                                                      //Setting No Upper limit
	  System.out.println("Infinite While Loop =" +i);                         //Statement
  }
  }
  public static void practiceNestedLoop(){
	  int i;
	  int j;
	  for (i = 1; i <=10; i++){
	  for(j = 1; j <=10;j++){
		 int multipicationTable = i * j;
		 System.out.print(multipicationTable + " ");
	  }
	  System.out.println(" ");                                     //Statement for i loop
			  
		  } 
	  }
}
