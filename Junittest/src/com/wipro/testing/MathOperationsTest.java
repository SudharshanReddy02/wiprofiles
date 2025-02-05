package com.wipro.testing;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.wipro.cals.MathOperations;

class MathOperationsTest {

    MathOperations math = new MathOperations();

    @Test
    void testAddition() {
        assertEquals(10, math.add(5, 5));
        assertEquals(0, math.add(-3, 3));
    }

    @Test
    void testSubtraction() {
        assertEquals(2, math.subtract(5, 3));
        assertEquals(-8, math.subtract(-5, 3));
    }

    @Test
    void testMultiplication() {
        assertEquals(15, math.multiply(3, 5));
        assertEquals(0, math.multiply(5, 0));
    }

    @Test
    void testDivision() {
        assertEquals(2, math.divide(10, 5));
        assertThrows(ArithmeticException.class, () -> math.divide(5, 0));
    }
}
