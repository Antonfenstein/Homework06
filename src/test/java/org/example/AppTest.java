package org.example;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    Calculator calculator;
    @Before
    public void setupEachTest() {
        // run before each test
        System.out.println("Before every test");
        System.out.println("---------------->");
        calculator = new Calculator();
    }

    @BeforeClass
    public static void setupEachTestSet() {
        // run before each test suite
        System.out.println("Before every test suite !");
    }

    @After
    public void teardownTest() {
        // run after each test
        System.out.println("After every test");
        System.out.println("---------------->");
    }

    @AfterClass
    public static void teardownTestSuite() {
        // run after each test
        System.out.println("After every test suite");
    }


    @Test
    public void substractionPositiveNumbersFirstBigger()
    {
        System.out.println("True test");
       int result = calculator.substraction(3,2);
       assertEquals(1, result);
//        assertTrue( true );
    }
    @Test
    public void substractionZeroAndNegative()
    {
        System.out.println("True test");
        int result = calculator.substraction(21,-4);
        assertEquals(25, result);
//        assertTrue( true );
    }


    @Test
        public void shouldAnswerWithFalse()
    {
        System.out.println("False test");
        assertFalse( false );
    }



}
