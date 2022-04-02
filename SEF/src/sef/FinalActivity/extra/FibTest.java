package sef.FinalActivity.extra;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

import static sef.FinalActivity.extra.Fib.calculateFibonacci;

public class FibTest {
    @Test
    public void testFibonacci() {
        Assert.assertEquals(BigInteger.ZERO, calculateFibonacci(0L) );
        Assert.assertEquals(new BigInteger(String.valueOf(5)), calculateFibonacci(5L) );
        Assert.assertEquals(new BigInteger(String.valueOf(8)), calculateFibonacci(6L) );
        Assert.assertEquals(new BigInteger(String.valueOf(13)), calculateFibonacci(7L) );
        Assert.assertEquals(new BigInteger(String.valueOf(12586269025L)), calculateFibonacci(50L) );
        Assert.assertEquals(new BigInteger(String.valueOf(2880067194370816120L)), calculateFibonacci(90L) );
        Assert.assertEquals(new BigInteger(
                "43466557686937456435688527675040625802564660517371780402481729089536555417949051890403879840079255169295922593080322634775209689623239873322471161642996440906533187938298969649928516003704476137795166849228875"
        ), calculateFibonacci(1000L) );
        Assert.assertEquals(BigInteger.ZERO, calculateFibonacci(-9L) );
    }
}
