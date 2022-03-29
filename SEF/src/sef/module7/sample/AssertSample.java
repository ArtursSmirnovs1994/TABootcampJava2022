package sef.module7.sample;

// Needs to be completed
//Run this class with -ea option enabled in JVM arguments
public class AssertSample {

    public static void test(int a, int b, int expected) {
        int result = a % b;
        assert result == expected : "\nExpected: " + expected + "; result: " + result;
//		assert 5 %2  ==1;
//		assert 6%2 == 1 : "Error message if sth has failed";
        //1 - Type assert 5 %2 and 6%2 in separate statements

    }

    public static void main(String arg[]) {
        //2 - Call test()
        test(5, 2, 1);
        test(4, 2, 1);

    }
}
