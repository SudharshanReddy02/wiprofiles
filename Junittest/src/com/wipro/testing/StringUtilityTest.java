package com.wipro.testing;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.wipro.cals.StringUtility;

public class StringUtilityTest {

    private StringUtility stringUtility;

    // Runs before each test
    @Before
    public void setUp() {
        stringUtility = new StringUtility();
    }

    // Test reverse() method with assertEquals
    @Test
    public void testReverse() {
        assertEquals("gnitset", stringUtility.reverse("testing"));  // reverse of "testing"
        assertEquals("madam", stringUtility.reverse("madam"));  // palindrome case
        assertEquals("abc", stringUtility.reverse("cba"));  // reverse of "cba"
    }

    // Test isPalindrome() method with assertTrue and assertFalse
    @Test
    public void testIsPalindrome() {
        assertTrue(stringUtility.isPalindrome("madam"));  // "madam" is a palindrome
        assertFalse(stringUtility.isPalindrome("hello"));  // "hello" is not a palindrome
        assertFalse(stringUtility.isPalindrome("abc"));  // "abc" is not a palindrome
    }

    // Test isEmpty() method with assertTrue and assertFalse
    @Test
    public void testIsEmpty() {
        assertTrue(stringUtility.isEmpty(""));  // empty string is considered empty
        assertTrue(stringUtility.isEmpty(null));  // null string is considered empty
        assertFalse(stringUtility.isEmpty("not empty"));  // non-empty string should return false
    }
}
