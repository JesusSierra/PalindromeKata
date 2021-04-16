package mx.tec.kata;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeValidatorTest {
	
	PalindromeValidator validator = new PalindromeValidator();

	@Test
	void Given_SingleLetterString_When_ValidatingPalindrome_Then_True() {
		//Given
		String string = "a";
		//When
		boolean actualResult = validator.validate(string);
		//Then
		boolean expectedResult = true;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void Given_TwoDifferentLettersString_When_ValidatingPalindrome_Then_False() {
		//Given
		String string = "ab";
		//When
		boolean actualResult = validator.validate(string);
		//Then
		boolean expectedResult = false;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void Given_TwoEqualLettersString_When_ValidatingPalindrome_Then_True() {
		//Given
		String string = "aa";
		//When
		boolean actualResult = validator.validate(string);
		//Then
		boolean expectedResult = true;
		assertEquals(expectedResult, actualResult);
	}

}
