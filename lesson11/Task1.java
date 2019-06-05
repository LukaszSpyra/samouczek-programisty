package pl.samouczekprogramisty.lesson11;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe calkowita:");
        Scanner input = new Scanner(System.in);
        double resultDouble = input.nextLong()*Math.PI; //long rzutowane na double automatycznie
        long resultLong = (long)resultDouble; //double jawnie rzutowane na long - odrzucenie czesc ulamkowej
        System.out.println(resultDouble+" "+resultLong);

    }
}
