package pl.samouczekprogramisty.setofexercises.methods;

import java.util.ArrayList;
import java.util.List;

public class MethodExercises {

    private static String getMyName() {
        return "Karol";
    }

    private static void calculateSumDifferenceProduct(int number1, int number2) {
        System.out.println("Sum = " + (number1 + number2));
        System.out.println("Difference = " + (number1 - number2));
        System.out.println("Product = " + (number1 * number2));
    }

    private static boolean checkIfEven(int number) {
        return (number % 2 == 0);
    }

    private static boolean checkIfDividedBy3And5(int number) {

        return ((number % 3 == 0) && (number % 5 == 0));
    }

    private static int powerOfNumber(int number) {

        return (int) Math.pow(number, 3);
    }

    private static double squareRoot(int number) {

        return Math.sqrt(number);
    }

    private static boolean checkIfCanCreateRightTriangle(int leg1, int leg2, int leg3) {
        List<Integer> legs = new ArrayList<>();
        legs.add(leg1);
        legs.add(leg2);
        legs.add(leg3);
        legs.sort(null);
        return Math.pow(legs.get(0), 2) + Math.pow(legs.get(1), 2) == Math.pow(legs.get(2), 2);
    }

    public static void main(String[] args) {
        System.out.println(getMyName());
        calculateSumDifferenceProduct(4, 5);
        System.out.println(checkIfEven(5));
        System.out.println(checkIfDividedBy3And5(15));
        System.out.println(powerOfNumber(5));
        System.out.println(squareRoot(25));
        System.out.println(checkIfCanCreateRightTriangle(4, 5, 3));
    }
}
