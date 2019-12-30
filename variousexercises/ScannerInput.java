package variousexercises;

import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        System.out.println("Podaj 2 liczby calkowite");
        System.out.println("Pierwsza liczba:");
        Scanner input1 = new Scanner(System.in);
        long first = input1.nextLong();
        System.out.println("Druga liczba:");
        Scanner input2 = new Scanner(System.in);
        long second = input2.nextLong();
        double resultDivide = first / second;
        System.out.println(resultDivide);
    }
}
