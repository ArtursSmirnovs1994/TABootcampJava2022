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


        int i = 5;
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
            case 6:
                numText = "SIX";
            case 7:
                numText = "SEVEN";
            case 8:
                numText = "EIGHT";
            case 9:
                numText = "NINE";
            case 10:
                numText = "TEN";
            default:
                numText = "NUMBER " + i;
        }

        System.out.println(numText);


    }


}
