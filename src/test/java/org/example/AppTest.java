package org.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Before
    public void setupEachTest() {
        // run before each test
        System.out.println("Before every test");
        System.out.println("---------------->");
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
    public void shouldAnswerWithTrue()
    {
        System.out.println("True test");
        assertTrue( true );
    }

    @Test
    public void shouldAnswerWithFalse()
    {
        System.out.println("False test");
        assertFalse( false );
    }



}
