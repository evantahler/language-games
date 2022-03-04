package com.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    @DisplayName("Addition")
    void addition() {
        assertEquals(2, calculator.add(1, 1));
    }

    @Test
    @DisplayName("Subtraction")
    void subtraction() {
        assertEquals(2, calculator.subtract(3, 1));
    }

    @Test
    void failTest() {
        System.out.println("This test method should be run");
    }
}


