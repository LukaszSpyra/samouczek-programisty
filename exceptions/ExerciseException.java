package exceptions;

import java.util.Scanner;

public class ExerciseException {

    public static void main(String[] args) {
        ExerciseException exerciseException = new ExerciseException();
        boolean a=false;
        while (a==false){
            try {
                double result = java.lang.Math.sqrt(exerciseException.getNumber());
                System.out.println(result);
                a=true;
            } catch (java.util.InputMismatchException ex) {
                System.out.println("Podana wartosc nie moze byc zostac pierwiastkowana, sprobuj jeszcze raz.");
            }
        }
    }

    public double getNumber() throws IllegalArgumentException {
        System.out.println("Podaj liczbe do pierwiastkowania:");
        Scanner input = new Scanner(System.in);
        double scannerInput = input.nextDouble();
        if (scannerInput < 0){
            throw new IllegalArgumentException(String.format("Pierwiastek z liczby ujemnej nie istnieje"));
        }
        return input.nextDouble();
    }
}
