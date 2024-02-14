package org.example;

public class HandlingExceptions {
    public static void main(String[] args) {
        double[] prices = {5.90, 18.99, 64.0, 99.00, 79.50};
        int index = 5;

        try {
            System.out.println(String.format("\nThe price at index %d is %f\n", index, prices[index]));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}