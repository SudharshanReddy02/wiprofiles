package com.wipro.testing;
import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;

public class ExampleTest {

    // Runs once before all tests (static)
    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("BeforeClass: Runs once before all tests.");
    }

    // Runs once after all tests (static)
    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("AfterClass: Runs once after all tests.");
    }

    // Runs before each test
    @Before
    public void setUp() {
        System.out.println("Before: Runs before each test.");
    }

    // Runs after each test
    @After
    public void tearDown() {
        System.out.println("After: Runs after each test.");
    }

    @Test
    public void testMethod1() {
        System.out.println("Test Method 1: Running test 1.");
    }

    @Test
    public void testMethod2() {
        System.out.println("Test Method 2: Running test 2.");
    }
}
