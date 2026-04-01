package assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputValidation {

	private final Solver solver = new Solver();

	@Test
	void testNullInput() {
		boolean result = solver.checkDigits(null);
		assertEquals(false, result);
	}

	@Test
	void testEmptyInput() {
		
		boolean result = solver.checkDigits("");
		assertEquals(false, result);
	}

	@Test
	void testTooLongInput() {
		boolean result = solver.checkDigits("23456");
		assertEquals(false, result);
	}

	@Test
	void testInvalidInput() {
		boolean result = solver.checkDigits("23a");
		assertEquals(false, result);
	}

	@Test
	void testValidInput() {
		boolean result = solver.checkDigits("234");
		assertEquals(true, result);
	}

}