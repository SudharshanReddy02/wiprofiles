package com.wipro.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.wipro.cals.Calculator;

class CalculatorTest {

	@Test
	@Disabled
	void testAdd() {
		Calculator ca12=new Calculator();
		int actual= cal2.add(10,3);
		assertEquals(7,actual);
	}

	@Test
	@DisplayName("sub")
	void testSub() {
		Calculator cal1=new Calculator();
		int actual=cal1.sub(15, 3);
		assertEquals(12,actual);
	}

}
