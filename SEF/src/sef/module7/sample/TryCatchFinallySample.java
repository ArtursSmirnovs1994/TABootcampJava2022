package sef.module7.sample;
// Needs to be completed
public class TryCatchFinallySample {

	//The following String variable is declared at class level. It'd automatically be initialized to null.
	String str;
	
	public static void main(String[] args) {
		//1 - Create an instance of TryCatchFinallySample and call catchMeIfYouCan()
		TryCatchFinallySample tryCatchFinallySample = new TryCatchFinallySample();
		tryCatchFinallySample.catchMeIfYouCan();
	}
	
	public void catchMeIfYouCan()
	{
		//As long as we try to print it, it'd work and print null.		
		System.out.println(str);
		
		//However, when we try to execute any operations on it, it'd throw a NullPointerException 
		//Uncomment the following line and then run to see what happens.
		try {
			System.out.println(str.toUpperCase());
		} catch (NullPointerException e) {
			e.printStackTrace();
		} finally {
			str = "str now has a FINAL value";
			System.out.println(str);
		}

		//You should program in a way that such issues are captured. Follow the instructions given by your trainer to complete this code with try, catch, finally blocks

		//Lets see how do we handle this
		//2 - put the above print statement inside a try catch block 
		
		
		
		
	}
	
}
