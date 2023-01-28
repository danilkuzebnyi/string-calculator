package org.danylo;

import java.util.List;

public class Calculator {
    public int addNumbers(List<Integer> numbers) {
        validateNumbers(numbers);
        return numbers.stream().mapToInt(Integer::intValue).filter(number -> number <= 100).sum();
    }

    private void validateNumbers(List<Integer> numbers) {
        boolean isThereAnyNegativeNumber = numbers.stream().anyMatch(number -> number < 0);
        if (isThereAnyNegativeNumber) {
            throw new NegativeNumberException("Calculator does not support negative numbers");
        }
    }
}
