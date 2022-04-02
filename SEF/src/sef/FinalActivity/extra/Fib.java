package sef.FinalActivity.extra;

import javax.annotation.Nullable;
import java.io.Console;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fib {
    public static BigInteger calculateFibonacci(Long numberN) {
        return calculateFibonacci(numberN, null);
    }

    /* Calculates the Fibonacci sequence using dynamic programming paradigm
     * Returns 0 for negative numbers*/
    private static BigInteger calculateFibonacci(Long numberN, @Nullable Map<Long, BigInteger> storedResults) {
        if (numberN == 0) {
            storedResults.put(0L, BigInteger.ZERO);
            return BigInteger.ZERO;
        }
        if (numberN < 0) {
            return BigInteger.ZERO;
        }
        if (numberN <= 2) {
            storedResults.put(numberN-1, BigInteger.ONE);
            return BigInteger.ONE;
        }
        if (storedResults == null) {
            storedResults = new HashMap<>();
        }
        if (storedResults.containsKey(numberN)) {
            return storedResults.get(numberN);
        }
        BigInteger result = (calculateFibonacci(numberN - 1, storedResults).add(
                calculateFibonacci(numberN - 2, storedResults))
        );
        storedResults.put(numberN, result);
        return result;
    }

    private static BigInteger calculateFibonacci2(Long numberN, @Nullable Map<Long, BigInteger> storedResults, BigInteger[] outputResults) {
        if (numberN == 0) {
            storedResults.put(0L, BigInteger.ZERO);
            outputResults[0] = BigInteger.ZERO;
            return BigInteger.ZERO;
        }
        if (numberN < 0) {
            return BigInteger.ZERO;
        }
        if (numberN == 1) {
            storedResults.put(numberN-1, BigInteger.ONE);
            outputResults[1] = BigInteger.ONE;
            return BigInteger.ONE;
        }
        if (storedResults == null) {
            storedResults = new HashMap<>();
        }
        if (storedResults.containsKey(numberN)) {
            return storedResults.get(numberN);
        }
        BigInteger result = (calculateFibonacci2(numberN - 1, storedResults, outputResults).add(
                calculateFibonacci2(numberN - 2, storedResults, outputResults))
        );
        storedResults.put(numberN, result);
        outputResults[Math.toIntExact(numberN)] = result;
        return result;
    }

    public static BigInteger[] printFibonacci(Long count) {
        BigInteger[] outputResults = new BigInteger[Math.toIntExact(count)];
        Arrays.fill(outputResults, BigInteger.ZERO);

        calculateFibonacci2(count-1,null, outputResults);
        System.out.println(
                Arrays.toString(outputResults)
        );
        return outputResults;
    }

    final Integer MAX_INPUT = 5000; // HashMap may break at about 6600

    enum ValidationResult {USER_EXIT, MAX_EXCEEDED, NEGATIVE_NUMBER, NOT_A_NUMBER, EMPTY, OK}

    public void calculateByUserInput() {
        Scanner c = new Scanner(System.in);

        boolean isExit = false;
        do {
            System.out.printf("Enter N up to %d or Q to exit%n> ", MAX_INPUT);
            String input = c.nextLine().trim();
            switch (validateInput(input)) {
                case OK -> {
                    BigInteger result = calculateFibonacci( Long.valueOf(input) );
                    System.out.printf("Calculated result is %d%n", result);
                }
                case USER_EXIT -> {
                    isExit = true;
                    System.out.println("Bye!");
                }
                case MAX_EXCEEDED -> {
                    System.out.println("Maximum N exceeded");
                }
                case NEGATIVE_NUMBER -> {
                    System.out.println("Negative N is not allowed");
                }
                case EMPTY -> {
                }
                case NOT_A_NUMBER -> {
                    System.out.println("Input was not an integer");
                }
                default -> {
                }
            }
        } while (!isExit);
        c.close();
    }


    private ValidationResult validateInput(String input) {
        if (input.length() == 0) {
            return ValidationResult.EMPTY;
        }
        if (input.equals("Q") || input.equals("q")) {
            return ValidationResult.USER_EXIT;
        }
        try {
            Long.parseLong(input);
        } catch (NumberFormatException nfe) {
            return ValidationResult.NOT_A_NUMBER;
        }
        try {
            if (Long.parseLong(input) > MAX_INPUT) {
            return ValidationResult.MAX_EXCEEDED;
        }
        if (Long.parseLong(input) < 0) {
            return ValidationResult.NEGATIVE_NUMBER;
        }
        } catch (NumberFormatException nfe) {
            return ValidationResult.MAX_EXCEEDED;
        }
        return ValidationResult.OK;
    }

    public static void main(String[] args) {
        new Fib().calculateByUserInput();
    }
}
