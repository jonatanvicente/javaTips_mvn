package org.javatips.assertions;

public class AssertSample {

    /**
     * Assert keyword is used to create an assertion, which is a statement that enables you to test
     * your assumptions about your program. Assertions are typically used for debugging purposes to
     * make sure that the program is running as expected.
     *
     * An assertion is a boolean expression that you believe to be true at a specific point in your
     * program. If the expression evaluates to false, the assertion fails and an AssertionError is thrown.
     * To enable assertions when running your Java program, you need to use the -ea (or -enableassertions) flag:
     *      java -ea AssertionExample
     * @param args
     */
    public static void main(String[] args) {
        int x = 5;
        assert x > 0 : "x should be greater than 0";
        System.out.println("Assertion passed, x is " + x);
    }
}
