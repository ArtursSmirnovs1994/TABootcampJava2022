package sef.module2.sample;

public class MethodSample {

    // Method to print out "Hello!"
    public void greet() {
        System.out.println("Hello!");
    }

    //Method to print out "Hello + name + !" - this method requires a variable to be passed
    public static void greet(String name) {
        System.out.println("Hello " + name + "!");
    }

    //Method which will return sum of two numbers
    public int sum(int x, int y) {
        return x + y;
    }

    public static void main(String arg[]) {
        MethodSample sample = new MethodSample();

        MethodSample.greet("Java Student");
        greet("Java Teacher");
        sample.greet();
        System.out.println("The sum of 1 and 2 is " + sample.sum(1, 2));

    }
}
