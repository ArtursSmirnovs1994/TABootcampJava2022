package sef.FinalActivity.extra;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;

import static sef.FinalActivity.extra.Fib.*;

public class FibTest {
    @Test
    public void testFibonacci() {
        Assert.assertEquals(BigInteger.ZERO, calculateFibonacci(0L));
        Assert.assertEquals(new BigInteger(String.valueOf(5)), calculateFibonacci(5L));
        Assert.assertEquals(new BigInteger(String.valueOf(8)), calculateFibonacci(6L));
        Assert.assertEquals(new BigInteger(String.valueOf(13)), calculateFibonacci(7L));
        Assert.assertEquals(new BigInteger(String.valueOf(12586269025L)), calculateFibonacci(50L));
        Assert.assertEquals(new BigInteger(String.valueOf(2880067194370816120L)), calculateFibonacci(90L));
        Assert.assertEquals(new BigInteger(
                "38789684543883256337019163083259053120821277146462451061605972148955501390440370970108229164622106" +
                        "6947929345285888297381348310200895498294036143015691147893836421656394410691021450563413370655" +
                        "8656238254656700712525929903854933813928836378347518908762970712033337052923107693008518093849" +
                        "8018038478139967488817655546537882916442689129803846137789690215022930824756663462249230718833" +
                        "2480328037503913035290330450584270114763524227021093463769910400671417488329842289149127310405" +
                        "4328753298044273676822977244987749874555691907703880637046832794811358973739993110106219308149" +
                        "0185708153978543791953056175107610530756887837660336673554452588448862416192105534574936758978" +
                        "4902798823435102359984466393485325641195222185956306047536464547076033090242080638258492915645" +
                        "2876291575759142343809142302917491088984155209854432486594079793571316841692868039545309545388" +
                        "6981146650820668628974206393234384884652409887423958738019769938203171742089322654688793640026" +
                        "3079778005875912967138963421425257911687275560036031137054775472460463998758804698517840867438" +
                        "2863125"
        ), calculateFibonacci(5000L));
        Assert.assertEquals(BigInteger.ZERO, calculateFibonacci(-9L));
    }

    @Test
    public void testPrintFibonacci() {
        String expected = "[0, 0, 1, 2, 3, 5, 8, 13, 21, 34]";
        Assert.assertEquals(expected,
                Arrays.toString(
                    printFibonacci(10)
                )
        );
    }


}
