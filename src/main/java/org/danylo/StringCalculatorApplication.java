package org.danylo;

import java.util.List;
import java.util.Scanner;

public class StringCalculatorApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        String line = input.nextLine();
        List<Integer> numbers = InputTools.parseString(line);
        Calculator calculator = new Calculator();
        System.out.println("Result is: " + calculator.addNumbers(numbers));
        input.close();
    }
}
