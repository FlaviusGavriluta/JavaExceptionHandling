package org.example;

public class HandlingExceptions {
    public static void main(String[] args) {
        double[] prices = {5.90, 18.99, 64.0, 99.00, 79.50};
        int index = 5;

        System.out.println("Start of the program");
        try {
            System.out.println(String.format("\nThe price at index %d is %f\n", index, prices[index]));
        } catch (Exception e) {
            System.out.println("An Exception occurred");
            e.printStackTrace();
            System.out.println("The Exception class: " + e.getClass());
            System.out.println("The Exception message: " + e.getMessage());
            System.out.println("The Exception localized message: " + e.getLocalizedMessage());
            System.out.println("The Exception cause: " + e.getCause());
        }
        System.out.println("End of the program");
    }
}