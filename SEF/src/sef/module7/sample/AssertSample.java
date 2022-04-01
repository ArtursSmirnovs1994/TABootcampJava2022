package sef.module7.sample;
// Needs to be completed
//Run this class with -ea option enabled in JVM arguments
public class AssertSample {

	public static void test(int a, int b, int excepted)
	{
		//1 - Type assert 5 %2 and 6%2 in separate statements
		int result = a%b;
		assert result == excepted : "\nExcepted result is " +excepted + " \nbut actual result is: " + result;

	}
	public static void main(String arg[]){
		//2 - Call test()
		test(5,2,1);
		test(6,2,1);
		
	}			
}
