package sef.module2.activity;

public class NumToWords {

    public static void main(String[] args) {

        int i = 7;
        String numText;

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
            case 0:
                numText = "ZERO";
                break;
            default:
                numText = "NUMBER " + i;
        }

        System.out.println(numText);

    }

}
