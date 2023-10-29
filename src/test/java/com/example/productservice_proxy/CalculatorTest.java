package com.example.productservice_proxy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Testing 1+2 = 3")
    // TEST WHEN THEN
    // TEST_WHENADDTWOINT_THENRETURNINT
    public void Test_AddTwoInteger_ReturnInteger() {
        //Arrange
        Calculator calculator = new Calculator();
        //Act
        int result = calculator.add(1, 2);
        //Assert
        assertEquals(3, result);
    }

    @Test
    public void Test_DivideByZero_ThrowException() {
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> calculator.div(1, 0));
    }
}