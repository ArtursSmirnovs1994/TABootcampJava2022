/**
 *
 */
package sef.module2.activity;

/**
 * @author
 *
 */
public class NumToWordsUsingMethod {

    /**
     * @param args
     */
    public static void main(String[] args) {
        //TODO complete the code to print text value of 8, 9 and 10
        for (int i = 8; i <= 10; i++) {
            printMyWord(i);
        }
    }

    private static void printMyWord(int i) {
        final String numText;
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
            default:
                numText = "NUMBER " + i;
        }
        System.out.println(numText);

    }

}
