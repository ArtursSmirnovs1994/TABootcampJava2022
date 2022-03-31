package sef.FinalActivity.extra;

import javax.annotation.Nullable;
import java.io.Console;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fib {
    public static Long calculateFibonacci(Long numberN) {
        return calculateFibonacci(numberN, null);
    }

    /* Calculates the Fibonacci sequence using dynamic programming paradigm */
    public static Long calculateFibonacci(Long numberN, @Nullable Map<Long, Long> storedResults) {
        if (storedResults == null) {
            storedResults = new HashMap<>();
        }
        if (storedResults.containsKey(numberN)) {
            return storedResults.get(numberN);
        }
        if (numberN == 0) {
            return 0L;
        }
        if (numberN <= 2) {
            return 1L;
        }
        Long result = (calculateFibonacci(numberN - 1, storedResults) + calculateFibonacci(numberN - 2, storedResults));
        storedResults.put(numberN, result);
        return result;
    }

    final Integer MAX_INPUT = 90;
    enum ValidationResult {USER_EXIT, MAX_EXCEEDED, NEGATIVE_NUMBER, NOT_A_NUMBER, EMPTY, OK}
    public void calculateByUserInput() {
        Scanner c = new Scanner(System.in);
        if (c == null) {
            System.err.println("Console unavailable.");
            return;
        }

        boolean isExit = false;
        do {
            System.out.printf("Enter N up to %d or Q to exit%n> ", MAX_INPUT);
            String input = c.nextLine();
            switch (validateInput(input)) {
                case OK -> {
                    Long result = calculateFibonacci( Long.valueOf(input) );
                    System.out.printf("Calculated result is %d%n", result);
                }
                case USER_EXIT -> { isExit = true; System.out.println("Bye!"); }
                case MAX_EXCEEDED -> {System.out.println("Maximum N exceeded");}
                case NEGATIVE_NUMBER -> { System.out.println("Negative N is not allowed"); }
                case EMPTY -> { }
                case NOT_A_NUMBER -> { System.out.println("Input was not a number"); }
                default -> { }
            }
        } while (!isExit);
    }


    private ValidationResult validateInput(String input) {
        input = input.trim();
        if (input.length() == 0) {return ValidationResult.EMPTY;}
        if (input.equals("Q") || input.equals("q")) { return ValidationResult.USER_EXIT; }
        try {
            Long.valueOf(input);
        }
        catch (NumberFormatException nfe) { return ValidationResult.NOT_A_NUMBER; }
        if (Integer.parseInt(input) > MAX_INPUT) { return ValidationResult.MAX_EXCEEDED; }
        if (Integer.parseInt(input) < 0) { return ValidationResult.NEGATIVE_NUMBER; }
        return ValidationResult.OK;
    }

    public static void main(String[] args) {
        new Fib().calculateByUserInput();
    }
}
