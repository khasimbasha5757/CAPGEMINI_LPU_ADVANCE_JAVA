package com.prac;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
public class CalculatorTest {	
	public void addTest() {
	int res=Calculator.add(20,30);
}
//@Test
	public void reverseTest() {
		String actualres=Calculator.reverseString("data");
		assertEquals("atad",actualres);
	}
//	@Test
	public void reverseTestNull() {
		String actualRes=Calculator.reverseString(null);
		assertEquals("llun",actualRes);
	}
	@Test
	public void testValidAge() {
		Employee e=new Employee(10,"Allen",20,"CSE");
		assertTrue(e.isValidAge());	
	}
	public void testAEEx() {
		assertThrows(ArithmeticException.class,()->Calculator.div(10,0));
	}
}