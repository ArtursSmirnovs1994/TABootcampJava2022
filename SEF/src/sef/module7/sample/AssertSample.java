package sef.module7.sample;
// Needs to be completed
//Run this class with -ea option enabled in JVM arguments
public class AssertSample {

	public static void test()
	{
		//1 - Type assert 5 %2 and 6%2 in separate statements
		assert 6%2==0 : "Assert 6%2";
		assert 5%2==0 : "Assert 5%2";
	}
	public static void main(String arg[]){
		//2 - Call test()
		AssertSample obj = new AssertSample();
		obj.test();
	}			
}
