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


        int i = 11;
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
            case 6:
                numText = "SIX";
                break;
            case 7:
                numText = "SEVEN";
                break;
            case 8:
                numText = "EIGHT";
                break;
            case 9:
                numText = "NINE";
                break;
            case 10:
                numText = "TEN";
                break;
            // complete the code.
            default:
                numText = "NUMBER " + i + ", but I don't know how to write this number, sorry :(";
        }

        System.out.println(numText);


    }


}
