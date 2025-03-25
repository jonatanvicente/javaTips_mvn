package org.javatips.functionalinterface;

public class Main {

    @FunctionalInterface //mandatory only if you want to enforce the single abstract method rule
    interface MathOperation {
        int operate(int a, int b);
    }
    // Using the functional interface
    public static void main(String[] args) {
        // Lambda expression for addition
        MathOperation addition = (a, b) -> a + b;
        // Lambda expression for subtraction
        MathOperation subtraction = (a, b) -> a - b;
        // Lambda expression for multiplication
        MathOperation multiplication = (a, b) -> a * b;
        // Lambda expression for division
        MathOperation division = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Division by zero");
            }
            return a / b;
        };

        // Using the functional interface implementations
        System.out.println("Addition: " + addition.operate(10, 5));
        System.out.println("Subtraction: " + subtraction.operate(10, 5));
        System.out.println("Multiplication: " + multiplication.operate(10, 5));
        System.out.println("Division: " + division.operate(10, 5));
    }
}
