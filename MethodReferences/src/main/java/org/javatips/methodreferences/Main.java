package org.javatips.methodreferences;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    // Constructor reference
    public Main() {
        System.out.println("Constructor called");
    }

    public static void main(String[] args) {
        // Static method reference
        Function<String, Integer> staticMethodRef = Main::staticMethod;
        System.out.println("Static method reference: " + staticMethodRef.apply("123"));

        // Instance method reference of a particular object
        Main example = new Main();
        Consumer<String> instanceMethodRef = example::instanceMethod;
        instanceMethodRef.accept("Instance method reference of a particular object");

        // Instance method reference of an arbitrary object of a particular type
        BiFunction<String, String, Boolean> arbitraryObjectMethodRef = String::equals;
        System.out.println("Instance method reference of an arbitrary object: " + arbitraryObjectMethodRef.apply("test", "test"));

        // Constructor reference
        Supplier<Main> constructorRef = Main::new;
        constructorRef.get();
    }

    // Static method reference
    public static Integer staticMethod(String s) {
        return Integer.parseInt(s);
    }

    // Instance method reference of a particular object
    public void instanceMethod(String s) {
        System.out.println(s);
    }

    // Instance method reference of an arbitrary object of a particular type
    public boolean instanceMethodOfArbitraryObject(String s1, String s2) {
        return s1.equals(s2);
    }



}
