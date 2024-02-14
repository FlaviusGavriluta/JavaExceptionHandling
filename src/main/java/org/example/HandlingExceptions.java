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
            System.out.println("Is e an Object? " + (e instanceof Object));
            System.out.println("Is e a Throwable? " + (e instanceof Throwable));
            System.out.println("Is e an Exception? " + (e instanceof Exception));
            System.out.println("Is e a RuntimeException? " + (e instanceof RuntimeException));
            System.out.println("Is e a ArrayIndexOutOfBoundsException? " + (e instanceof ArrayIndexOutOfBoundsException));
            System.out.println("Is e a ArithmeticException? " + (e instanceof ArithmeticException));
            System.out.println("Is e a StringIndexOutOfBoundsException? " + (e instanceof StringIndexOutOfBoundsException));
        }
        System.out.println("End of the program");
    }
}