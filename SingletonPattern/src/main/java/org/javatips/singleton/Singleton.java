package org.javatips.singleton;

public class Singleton {

    // Private constructor to prevent instantiation
    private Singleton() {}

    // Static inner class responsible for holding the Singleton instance
    private static class SingletonHelper {
        private static final Singleton INSTANCE = new Singleton();
    }

    // Public method to provide access to the Singleton instance
    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    // Example method to demonstrate functionality
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
