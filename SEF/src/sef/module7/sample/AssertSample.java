package sef.module7.sample;
// Needs to be completed
//Run this class with -ea option enabled in JVM arguments
public class AssertSample {

	public static void test() {
		//1 - Type assert 5 %2 and 6%2 in separate statements
		assert 5 % 2 == 1;
		assert 6 % 2 == 1 : "This should be executing successfully";
	}

	public static void main(String arg) {
		//2 - Call test()
		test();
	}


	public static void test(int a, int b, int excepted) {
		//1 - Type assert 5 %2 and 6%2 in separate statements
		int result = a % b;
		assert result == excepted : "Expected result is: " + excepted + "\n but actual result is: " + result;
	}

	public static void main(String arg[]) {
		//2 - Call test()
		test(5, 2, 1);
		test(5, 2, 1);
	}
}


