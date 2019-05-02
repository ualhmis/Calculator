package ual.hmis;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd() {
		Calculator calc = new Calculator();
		assertEquals(9, calc.add(5, 5), "4 + 5 must be 9");
	}

}
