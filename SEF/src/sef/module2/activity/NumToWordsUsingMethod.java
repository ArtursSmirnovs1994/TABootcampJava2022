package sef.module2.activity;

public class NumToWordsUsingMethod {

    public static void main(String[] args) {
        // complete the code to print text value of 8, 9 and 10
        printMyWord(8);
        printMyWord(9);
        printMyWord(42);
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
                break;
        }

        System.out.println(numText);
    }

}
