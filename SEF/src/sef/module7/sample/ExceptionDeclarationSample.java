package sef.module7.sample;
// Needs to be completed
public class ExceptionDeclarationSample {

	public static void setAge(int age){
		System.out.println("Age: " + age);
		if(age < 0 ){
			//1 - Throw an instance of  IllegalArgumentException with a String parameter
			//The parameter passed would be printed in the output
			throw new IllegalArgumentException("Value can't be negative");
		}
	}
	
	public static void main(String arg[]){
		//2 - Call setAge with a negative parameter
		ExceptionDeclarationSample obj = new ExceptionDeclarationSample();
		obj.setAge(10);
		obj.setAge(-1);
	}
}
