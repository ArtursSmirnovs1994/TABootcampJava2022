package sef.finalActivity.secondActivity;

public class Calculator {
  private int a;
  private int b;

  public int addition(int a, int b) {
//    if (a == 0 && b == 0){
//      throw new IllegalArgumentException("Value can't be null");
//    } else

    try {
      int result = a + 0;
      result = b + 0;
    } catch (ArithmeticException e) {
      System.out.println("Value can't be null");
    }
    return a + b;
  }

  public int subtraction(int a, int b) {
    try {
      int result = a - 0;
      result = b - 0;
    } catch (ArithmeticException e) {
      System.out.println("Value can't be null");
    }
    return a - b;
  }

  public int multiplication(int a, int b) {
    try {
      int result = a * 0;
    } catch (ArithmeticException e) {
      System.out.println("Multiplication by zero operation is not possible");
    }
    return a * b;
  }

  public int division(int a, int b) {
    try {
      int result = a / 0;
    } catch (ArithmeticException e) {
      //System.out.println("Division by zero operation is not possible");
    }
    return a / b;
  }

  public int getA() {
    return a;
  }

  public void setA(int a) {
    this.a = a;
  }

  public int getB() {
    return b;
  }

  public void setB(int b) {
    this.b = b;
  }

}
