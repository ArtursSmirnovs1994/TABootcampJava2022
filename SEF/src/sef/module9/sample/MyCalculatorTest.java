package sef.module9.sample;
// Complete Code
import junit.framework.TestCase; //our test class

public class MyCalculatorTest extends TestCase { //!!differs from other classes with this, name should end with "TEST"

	private MyCalculator theCalculator; //!!attribute mycalculator

	protected void setUp() throws Exception {
		super.setUp(); //!!test environment initialisation
		//	Initialize variables to be used here
		theCalculator = new MyCalculator(); //we will be using object calculator
	}//method to setup environment

	protected void tearDown() throws Exception {
		super.tearDown();
	}//method to turn off environment

	public void testGetSum() { //need to start name with test, otherwise GUNIT will recognize this as method
		
		int a = 5; //!!declared 2 objects
		int b = 10;			
		//	Checks the sum of two (2) positive values
		assertEquals(15, (theCalculator.getSum(a,b)));
		assertEquals(15, (theCalculator.getSum(b,a)));		

		a = -5;		
		b = 10;		
		//	Checks the sum of a positive value and a negative value
		assertEquals(5, (theCalculator.getSum(a,b)));
		assertEquals(5, (theCalculator.getSum(b,a)));
		
		a = -5;		
		b = -10;		
		//	Checks the sum of two (2) negative values
		assertEquals(-15, (theCalculator.getSum(a,b)));
		assertEquals(-15, (theCalculator.getSum(b,a)));
	}

	public void testGetDifference() {
		
		int a = 3;
		int b = 2;		
		//	Checks if b is lesser than a
		assertEquals(1, (theCalculator.getDifference(a,b)));		
		//	Checks if b is greater than a
		assertEquals(-1, (theCalculator.getDifference(b,a)));

		a = 5;
		b = -4;
		//	Checks if negative value is subtracted from positive value
		assertEquals(9, (theCalculator.getDifference(a,b)));		
		//	Checks if positive value is subtracted from negative value
		assertEquals(-9, (theCalculator.getDifference(b,a)));	
	
		a = -10;
		b = -5;
		//	Checks if negative value is subtracted from negative value: a > b
		assertEquals(-5, (theCalculator.getDifference(a,b)));		
		//	Checks if negative value is subtracted from negative value: b < a
		assertEquals(5, (theCalculator.getDifference(b,a)));			
	}

	public void testGetProduct() {
		
		double a = 5;
		double b = 10;			
		//	Checks the product of two (2) positive values
		assertEquals(50, (theCalculator.getProduct(a,b)),0);
		assertEquals(50, (theCalculator.getProduct(b,a)),0);		

		a = -5;		
		b = 10;		
		//	Checks the product of a postive value and a negative value
		assertEquals(-50, (theCalculator.getProduct(a,b)),0);
		assertEquals(-50, (theCalculator.getProduct(b,a)),0);
		
		a = -3;		
		b = -10;		
		//	Checks the product of two (2) negative values
		assertEquals(30, (theCalculator.getProduct(a,b)),0);
		assertEquals(30, (theCalculator.getProduct(b,a)),0);
	}

	public void testGetQuotient() {

		double a = 10;	double b = 5;		
		//	Checks if b is lesser than a
		assertEquals(2, (theCalculator.getQuotient(a,b)),0); //delta is acceptable margin of error
		//	Checks if b is greater than a
		assertEquals(0.5, (theCalculator.getQuotient(b,a)),0);

		a = 9;	b = -3;
		//	Checks if positive value is divided with negative value
		assertEquals(-3, (theCalculator.getQuotient(a,b)),0);		
		//	Checks if negative value is divided with positive value
		assertEquals(-0.33, (theCalculator.getQuotient(b,a)),0.007);	
	
		a = -10;	b = -5;
		//	Checks if negative value is divided with negative value: a > b
		assertEquals(2, (theCalculator.getQuotient(a,b)),0);		
		//	Checks if negative value is divided with negative value: b < a
		assertEquals(0.5, (theCalculator.getQuotient(b,a)),0);			
		}
		
		public void testThrowException(){
			
			try {

				theCalculator.getSum(2, 1);
				theCalculator.getDifference(3, 3);
				theCalculator.getProduct(0, 1);
				theCalculator.getQuotient(1, 0);
				new MyCalculator();
					
			} catch (Exception e) {
				fail();
			}
			  catch (Error e) {
				fail();
			}
		}
	}


