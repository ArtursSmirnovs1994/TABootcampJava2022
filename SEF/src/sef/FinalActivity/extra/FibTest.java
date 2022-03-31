package sef.FinalActivity.extra;

import org.junit.Assert;
import org.junit.Test;

import static sef.FinalActivity.extra.Fib.calculateFibonacci;

public class FibTest {
    @Test
    public void testFibonacci() {
        Assert.assertEquals((Long)5L, calculateFibonacci(5L) );
        Assert.assertEquals((Long)8L, calculateFibonacci(6L) );
        Assert.assertEquals((Long)13L, calculateFibonacci(7L) );
        Assert.assertEquals((Long)12586269025L, calculateFibonacci(50L) );
        Assert.assertEquals((Long)2880067194370816120L, calculateFibonacci(90L) );
    }
}
