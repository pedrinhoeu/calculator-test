package src.test.java.com.example;

import org.junit.jupiter.api.Test;

import src.main.java.com.example.Calculator;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(8, calculator.add(5, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(15, calculator.multiply(5, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2, calculator.divide(6, 3));
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }
}
