package sef.FinalActivity.extra;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

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
        if (numberN <= 2) {
            return 1L;
        }
        Long result = (calculateFibonacci(numberN - 1, storedResults) + calculateFibonacci(numberN - 2, storedResults));
        storedResults.put(numberN, result);
        return result;
    }
}
