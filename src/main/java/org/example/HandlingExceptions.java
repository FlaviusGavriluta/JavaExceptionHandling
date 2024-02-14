package org.example;

public class HandlingExceptions {
    public static void main(String[] args) {
        double[] prices = {5.90, 18.99, 64.0, 99.00, 79.50};
        int index = 5;

        System.out.println("Start of the program");

        try {
            System.out.println(String.format("\nThe price at index %d is %f\n", index, prices[index]));
        } catch (NullPointerException npe) {
            System.out.println("We never get here - the wrong Exception has been caught");
        }

        System.out.println("End of the program");
    }
}