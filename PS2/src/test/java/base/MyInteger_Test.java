package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		MyInteger first = new MyInteger(21);
		
		assertTrue(first.isOdd());
	}

	@Test
    public void test1() {
		
		MyInteger first = new MyInteger(22);
		
		assertTrue(first.isEven());
	}

	@Test
     public void test2() {
		
		MyInteger first = new MyInteger(13);
		
		assertTrue(first.isPrime());
	}
	@Test
     public void test3() {
 		
 		assertTrue(MyInteger.isOdd(21));
 	}
	@Test
     public void test4() {
  		
  		assertTrue(MyInteger.isEven(22));
  	}
	@Test
     public void test5() {
   		
   		assertTrue(MyInteger.isPrime(13));
   	}
	@Test
    public void test6() {
    	int number = 22;
    	assertTrue(MyInteger.isEven(number));
    }
	@Test
    public void test7() {
    	int number1 = 23;
    	assertTrue(MyInteger.isOdd(number1));
    } 
	@Test
    public void test8() {
    	int number2 = 13;
    	assertTrue(MyInteger.isPrime(number2));
    } 
}
