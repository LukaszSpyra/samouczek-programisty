package pl.samouczekprogramisty.lesson7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Computation computation;

        if (main.shouldMultiply()) {
            computation = new Multiplication(); // zaimplementuj brakującą klasę
        }
        else {
            computation = new Addition(); // zaimplementuj brakującą klasę
        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik: " + result);
    }

    private boolean shouldMultiply() {
        System.out.println("Wcisnij \"1\"-dodawanie, lub \"2\"-mozenie");
        Scanner inputScanner = new Scanner(System.in);
        if (inputScanner.nextDouble()==2){
            return true;
        }
        return false; // tutaj zapytaj użytkownika co chce zrobić (mnożenie czy dodawanie)
    }

    private double getArgument() {
        System.out.println("Podaj liczbe...");
        Scanner inputScanner = new Scanner(System.in);
        return inputScanner.nextDouble(); // tutaj pobierz liczbę od użytkownika
    }
}

