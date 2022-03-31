package sef.finalActivity.secondActivity;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.rules.ExpectedException;

public class CalculatorTest extends TestCase {
    private Calculator myCalculator;

    protected void setUp() throws Exception {
        super.setUp();
        myCalculator = new Calculator();}

        protected void tearDown() throws Exception {
            super.tearDown();
        }

        public void testGetSum() {
        int x = 2;
        int y = 4;
        assertEquals(6, (myCalculator.getSum(x,y)));

        x = -1;
        y = -2;

        assertEquals(-3, (myCalculator.getSum(x,y)));

        }

        public void testGetSubtraction() {
            int x = 2;
            int y = 4;
            assertEquals(-2,(myCalculator.getSubtraction(x,y)));

        }

    public void testGetMultiplication () {
        double x = 2;
        double y = 4;
        assertEquals(8.0,myCalculator.getMultiplication(x,y));
    }

        public void testGetDivision() {
            double x = 2;
            double y = 4;
            assertEquals(0.5,myCalculator.getDivision(x,y));

        }
public void testThrowException() {
        try {
//            Integer x = null;
//            Integer y = null;
//            myCalculator.getSum(x,y);
//            myCalculator.getSubtraction (x,y);
            myCalculator.getMultiplication(0,1);
            myCalculator.getDivision(1,0);
            new Calculator();
        } catch (Exception e) {
            fail();

        }
        finally {
            System.out.println("Try catch test executed");}
        }

        }






