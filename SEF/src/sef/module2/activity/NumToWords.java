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


        int i =0;
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
                numText = "Seven";
                break;
            case 8:
                numText = "Eight";
                break;
            case 9:
                numText = "Nine";
                break;
            case 10:
                numText = "Ten";
                break;
            // complete the code.
            default:
                numText = "NUMBER " + i;
        }

        System.out.println(numText);


    }


}
