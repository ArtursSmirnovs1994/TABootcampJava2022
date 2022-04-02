package sef.finalactivity.secondactivity;

public class calculator {

    public static void main(String[] args) {


        int a = 10;
        int b = 1;

        System.out.println("Sum of A and B is : "+ sum(a,b));
        System.out.println("Subraction of A and B is : "+ sub(a,b));
        System.out.println("multiple of A and B is : "+ mul(a,b));
        System.out.println("Divition of A and B is : "+ div(a,b));

    }
    static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
    static int sub(int a, int b) {
        int sub = a - b;
        return sub;
    }
    static int mul(int a, int b) {
        int mul = 0;
        if (a!=0 && b!=0) {
            mul = a * b;
            return mul;
        }
        else {
            try{
                if (a==0) {
                    for (a = 0; a <= 10; a++) {

                        mul = 0;
                        return a;
                    }
                }
                else {
                    for (b = 0; b <= 10; b++) {

                        mul = 0;

                        return mul;
                    }
                }

            }catch (IndexOutOfBoundsException boundsException){
                System.out.println("0 can not be divided with any number");
                return mul(a,b);
            }
            return mul;
        }


    }
    static int div(int a, int b) {
        int div = 0;
        if (a!=0 && b!=0) {
             div = a / b;
            return div;
        }
        else {
            try{
                if (a==0) {
                    for (a = 0; a <= 10; a++) {

                         div = 0;
                        return a;
                    }
                }
                else {
                    for (b = 0; b <= 10; b++) {

                        div = 0;

                        return div;
                    }
                }

            }catch (IndexOutOfBoundsException boundsException){
                System.out.println("0 can not be divided with any number");
                return div(a,b);
            }
            return div;
        }


    }


}
