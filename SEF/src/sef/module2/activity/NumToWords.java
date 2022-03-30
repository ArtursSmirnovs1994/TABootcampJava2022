/**
 *
 */
package sef.module2.activity;

/**
 * @author
 *
 */
public class NumToWords {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int i = 8;
        String numText = "";

        switch (i) {

            case 1:
                numText = "ONE";
                break;
            case 2:
                numText = "TWO";
                break;
            case 3:
                numText = "THREE";
                break;
            case 4:
                numText = "FOUR";
                break;
            case 5:
                numText = "FIVE";
                break;
            // complete the code.
            default:
                numText = "NUMBER " + i;
        }
        System.out.println(numText);

        String number = "ONE";
        switch (number){
            case "ONE":
                System.out.println("The number is one");
                break;
            case "TWO":
                    System.out.println("The number is two");
                break;
            default:
                System.out.println("I didn't know this number :");
        }
    }
}
