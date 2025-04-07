package org.javatips.varargs;

public class Main {

    public static void main(String[] args) {
        System.out.println("Average of 1, 2, 3: " + calculateAverage(1, 2, 3));
        System.out.println("Average of 4, 5: " + calculateAverage(4, 5));
        System.out.println("Average of no numbers: " + calculateAverage());
        System.out.println("Average of null: " + calculateAverage((Integer[]) null));
    }

    public static double calculateAverage(Integer... numbers) {

        if (numbers == null || numbers.length == 0) {
            System.out.println("WARNING: At least one number is required");
            return 0;
        }

        double sum = 0;
        int count = 0;

        for (Integer number : numbers) {
            if (number != null) {
                sum += number;
                count++;
            }
        }

        if (count == 0) {
            throw new IllegalArgumentException("At least one non-null number is required");
        }

        return sum / count;
    }
}