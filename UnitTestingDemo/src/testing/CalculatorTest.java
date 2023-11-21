package testing;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import calsi.Calculator;

class CalculatorTest {

	@Test
	void testAdd() {
		
		Calculator cal = new Calculator();
		
			int actual = cal.add(5,4);	
			
			//assertNotEquals(9, actual);
		//	assertEquals(9, actual);
			assert(10>actual);
		

			
			//assertNotNull(cal);
		
	}

	@Test
	void testSub() {
		
		
		Calculator cal = new Calculator();
		
		int actual = cal.sub(5,5);	
		
		assertEquals(0, actual);
		
		assertNotEquals(1, actual);
		 
		
		
	}
	@Before
	   public void before() {
	      System.out.println("before ");
	   }

}
