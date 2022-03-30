package sef.module2.sample;

public class WhileLoopSample {
	
	public static void main(String[] args) {


		System.out.println("While Loop");
		//Created a new int variable
		int counter = 0;
		// while counter will be less than 10, we will print out message
		//First of all condition will be checked
		while(counter < 10){
			//Then implemented code in while loop will be executed
			System.out.println("The value of counter is : " + counter);
			// increasing counter variable value so we do not have infinity loop
			counter++;		
		}
		
		System.out.println("\n\nDo-While Loop");
		counter = 1;

		// Do-While loop starts with keyword do, and in this case
		// first thing will be that code does the actions like printing out line
		// and then only checks for while condition
		do {
		
			System.out.println("The value of counter is : " + counter);
			counter++;		
		}while(counter < 10);
	}
}

