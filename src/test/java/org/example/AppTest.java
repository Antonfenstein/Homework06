package org.example;

import org.junit.*;

import static org.junit.Assert.*;


public class AppTest {
    Calculator calculator = new Calculator();

    @Test
    public void costInt() {
        int result = calculator.addition(3, 2);
        assertEquals(5, result);
    }

    @Test
    public void costZeros() {
        int result = calculator.addition(0, 0);
        assertEquals(0, result);
    }

    @Test
    public void costNegatives() {
        int result = calculator.addition(-1, -1);
        assertEquals(-2, result);
    }

    @Test
    public void substractInt() {
        int result = calculator.substraction(5, 2);
        assertEquals(3, result);
    }

    @Test
    public void substractZero() {
        int result = calculator.substraction(0, 0);
        assertEquals(0, result);
    }

    @Test
    public void substractNegatives() {
        int result = calculator.substraction(-10, -5);
        assertEquals(-5, result);
    }
User user = new User();
    @Test
    public void defaultNameIsNull() {
        assertNull(this.user.name);
    }
    @Test
    public void defaultIdIsZero() {
        assertEquals(0, this.user.id);
    }
    @Test
    public void defaultAgeIsZero() {
        assertEquals(0, this.user.age);
    }
    User oneMoreUser = new User("Anton", 2318, 32);

    @Test
    public void correctName() {
        assertEquals("Anton", this.oneMoreUser.name);
    }
    @Test
    public void correctId() {
        assertEquals(2318, this.oneMoreUser.id);
    }
    @Test
    public void correctAge() {
        assertEquals(32, this.oneMoreUser.age);
    }
    User oneElseUser = new User("Ivan", 1000, 25);

    @Test
    public void correctMethod() {
        assertEquals(oneElseUser.name, this.oneElseUser.changeName("AAA"));
    }

}
