package org.danylo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    static Calculator calculator;

    @BeforeAll
    static void init() {
        calculator = new Calculator();
    }

    @Test
    void addNumbers_AddOneNaturalNumber() {
        List<Integer> numbers = List.of(1);
        assertEquals(1, calculator.addNumbers(numbers));
    }

    @Test
    void addNumbers_AddTwoNaturalNumbers() {
        List<Integer> numbers = List.of(1, 2);
        assertEquals(3, calculator.addNumbers(numbers));
    }

    @Test
    void addNumbers_IgnoreNumbersGreaterThanOneHundred() {
        List<Integer> numbers = List.of(1, 2, 100, 101);
        assertEquals(103, calculator.addNumbers(numbers));
    }

    @Test
    void addNumbers_ThrowExceptionIfThereIsNegativeNumber() {
        List<Integer> numbers = List.of(-1, 2, 100);
        assertThrows(NegativeNumberException.class, () -> calculator.addNumbers(numbers));
    }

    @Test
    void addNumbers_EmptyLineGiveZeroSum() {
        String line = "";
        List<Integer> numbers = InputTools.parseString(line);
        assertEquals(0, calculator.addNumbers(numbers));
    }

    @Test
    void addNumbers_NullGiveZeroSum() {
        String line = "null";
        List<Integer> numbers = InputTools.parseString(line);
        assertEquals(0, calculator.addNumbers(numbers));
    }
}