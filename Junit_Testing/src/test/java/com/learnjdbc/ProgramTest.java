package com.learnjdbc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.connectDataBase.Program;
import com.connectDataBase.evenOrOdd;

public class ProgramTest {
		
//		@ValueSource(strings= {"tenet","radar","aba","abcd"})
//		public void isPalindromeTest(String str) {
//			Program p=new Program();
//			assertTrue(p.isPalindrome(str));
//			
//		}
//	@ParameterizedTest
//	@ValueSource(
//		ints= {10,9,-3})	
//	public void PositiveOrNotTest(int num) {
//			Program p=new Program();
//			assertTrue(p.PositiveOrNot(num));
//		}
//		@ParameterizedTest
//		@CsvSource({
//		"1,2,3",
//		"5,5,10",
//		"5,3,8"
//		})
//		public void addTest(int a,int b,int expectedResult) {
//				Program p=new Program();
//				int actualres=p.add(a,b);
//				assertEquals(expectedResult,actualres);
//		}
		@ParameterizedTest
		@CsvFileSource(resources="/capgemini.csv",numLinesToSkip=1)
		public void evenoroddTest(String input,String expected) {
			evenOrOdd eoo=new evenOrOdd();
			String actualres=eoo.evenorOdd(Integer.parseInt(input));
			assertEquals(expected,actualres);
		}
				
}
