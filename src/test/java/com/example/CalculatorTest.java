package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Calculator
 */
@DisplayName("Calculator Tests")
class CalculatorTest {
    
    private Calculator calculator;
    
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }
    
    @Test
    @DisplayName("Test 1: Addition of positive numbers")
    void testAddPositiveNumbers() {
        int result = calculator.add(5, 3);
        assertEquals(8, result, "5 + 3 should equal 8");
    }
    
    @Test
    @DisplayName("Test 2: Subtraction operation")
    void testSubtract() {
        int result = calculator.subtract(10, 4);
        assertEquals(6, result, "10 - 4 should equal 6");
    }
    
    @Test
    @DisplayName("Test 3: Multiplication of numbers")
    void testMultiply() {
        int result = calculator.multiply(7, 6);
        assertEquals(42, result, "7 * 6 should equal 42");
    }
    
    @Test
    @DisplayName("Test 4: Division operation")
    void testDivide() {
        double result = calculator.divide(10, 2);
        assertEquals(5.0, result, 0.001, "10 / 2 should equal 5.0");
    }
    
    @Test
    @DisplayName("Test 5: Division by zero throws exception")
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        }, "Division by zero should throw ArithmeticException");
    }
}
