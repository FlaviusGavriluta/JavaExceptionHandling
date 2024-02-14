package org.example;

public class HandlingExceptions {
    public static void main(String[] args) {
        double[] prices = {5.90, 18.99, 64.0, 99.00, 79.50};
        int index = 5;

        System.out.println("Start of the program");
        try {
            System.out.println(String.format("\nThe price at index %d is %f\n", index, prices[index]));
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("An Exception occurred:");
            System.out.println("You have exceeded the array bounds.");

            if (index < 0)
                System.out.println("The first price in the array is: " + prices[0]);
            else
                System.out.println("The last price in the array is: " + prices[prices.length - 1]);
        }
        System.out.println("End of the program");
    }
}